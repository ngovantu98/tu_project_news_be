package com.vti.controller;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vti.dto.NewsDetailDTO;
import com.vti.entity.NewsDetail;
import com.vti.dto.NewsDetailFormCreate;
import com.vti.service.INewsDetailService;

@RestController
@RequestMapping(value = "api/v1/newsDetails")
public class NewsDetailController {
	
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private INewsDetailService service;

	@GetMapping()
	public List<NewsDetailDTO> getAllNewsDetails() {
		List<NewsDetail> entities = service.getAllNewsDetails();

		// convert entities --> dtos
		List<NewsDetailDTO> dtos = modelMapper.map(entities, new TypeToken<List<NewsDetailDTO>>() {
		}.getType());

		return dtos;
	}


	@GetMapping(value = "/{id}")
	public NewsDetail getNewsSummaryByID(@PathVariable(name = "id") int id) {
		return service.getNewsDetailByID(id);
	}

	@PostMapping()
	public ResponseEntity<String> createNewsSummary(@RequestBody NewsDetailFormCreate form) {
		service.createNewsDetail(form);
		return new ResponseEntity<String>("Tạo mới tin tức thành công!", HttpStatus.OK);
	}

	@PutMapping(value = "/{id}")
	public void updateNewsSummary(@PathVariable(name = "id") int id, @RequestBody NewsDetailFormCreate form) {
		NewsDetail newsSummary = form.toEntity();
		newsSummary.setId(id);
		
		service.updateNewsDetail(newsSummary);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteNewsSummary(@PathVariable(name = "id") int id) {
		service.deleteNewsDetail(id);
		
	}
	
//	@GetMapping(value = "/type/{type}")
//	public List<NewsDetailDTO> getNewsSummaryByType(@PathVariable(name = "type") String type) {
//		List<NewsDetail> entities = service.getNewsDetailByType(type);
//		
//		List<NewsDetailDTO> dtos = modelMapper.map(entities, new TypeToken<List<NewsDetailDTO>>() {
//			}.getType());
//	
//			return dtos;
//		}

}
