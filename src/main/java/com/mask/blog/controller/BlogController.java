/*package com.mask.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mask.blog.domain.es.EsBlog;
import com.mask.blog.repository.es.EsBlogRepository;


*//**
 * Blog控制器
 * @author Mask
 *
 *//*

@RestController
@RequestMapping("/blogs")
public class BlogController {
	
	@Autowired
	private EsBlogRepository esBlogRepository;
	
	@GetMapping
	public List list(@RequestParam(value="title") String title, 
			@RequestParam(value="summary") String summary,
			@RequestParam(value="content") String content,
			@RequestParam(value="pageIndex", defaultValue="0") int pageIndex,
			@RequestParam(value="pageSize", defaultValue="10") int pageSize) {
		Pageable pageable = new PageRequest(pageIndex, pageSize);
		Page<EsBlog> page = esBlogRepository.findDistinctEsBlogByTitleContainingOrSummaryContainingOrContentContaining(title, summary, content, pageable);
		return page.getContent();
	}
}
*/