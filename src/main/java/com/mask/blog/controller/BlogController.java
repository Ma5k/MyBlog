package com.mask.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Blog控制器
 * @author Mask
 *
 */

@Controller
@RequestMapping("/blogs")
public class BlogController {
	
	/*@Autowired
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
	}*/
	
	@GetMapping
	public String listBlogs(@RequestParam(value="order",required=false,defaultValue="new") String order,
			@RequestParam(value="tag",required=false) Long tag) {
		System.out.print("order:" +order + ";tag:" +tag );
		return "redirect:/index?order="+order+"&tag="+tag;
	}
}