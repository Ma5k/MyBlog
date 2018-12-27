package com.mask.blog.repository.es;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.mask.blog.domain.es.EsBlog;
import com.mask.blog.service.EsBlogService;

public class EsRepositoryTest {
	@Autowired
	private static EsBlogService esBlogService;
	
	public static void main(String[] args) {
		Integer pageIndex = 0;
		Integer pageSize = 1;
		Pageable pageable = new PageRequest(pageIndex, pageSize);
		Page<EsBlog> page = esBlogService.listEsBlogs(pageable);
		System.out.println(page);
	}
}
