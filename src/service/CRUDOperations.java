package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Blog;

public class CRUDOperations {
	static List<Blog> list = new ArrayList<Blog>(); // Store the blog in the list

	public List<Blog> createBlog(Blog blog) throws IOException {
		list.add(blog);
		viewBlog(blog);
		return list;
	}

	public List<Blog> viewBlog(Blog blog) throws IOException {
		System.out.println("*****Display List*****");
		System.out.println("------------------------------------------");
		System.out.println("Title  |\t Description  |\t Date");
		System.out.println("------------------------------------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(
					list.get(i).getBlogTitle() + " " + list.get(i).getBlogDescription() + " " + list.get(i).getDate());
		}
		sortingBasedOnTitle();
		return list;

	}

	public List<Blog> updateBlog(Blog blog) throws IOException {

		return null;

	}

	public List<Blog> deleteBlog(Blog blog) throws IOException {
		return null;

	}

	public List<Blog> sortingBasedOnTitle() {
		System.out.println("*******Sorting Based On Title******");
		System.out.println("------------------------------------------");
		System.out.println("Title  |\t Description  | \t Date");
		System.out.println("------------------------------------------");
		Collections.sort(list, Comparator.comparing(Blog::getBlogTitle));
		for (Blog blog : list) {
			System.out.println(blog.getBlogTitle() + " " + blog.getBlogDescription() + " " + blog.getDate());
		}
		sortingBasedOnPostedDate();
		return list;
	}

	public List<Blog> sortingBasedOnPostedDate() {
		System.out.println("******Sorting Based On Posted Date********");
		System.out.println("------------------------------------------");
		System.out.println("Title  |\t Description   |\t Date");
		System.out.println("------------------------------------------");
		Collections.sort(list, Comparator.comparing(Blog::getDate));
		for (Blog blog : list) {
			System.out.println(blog.getBlogTitle() + " " + blog.getBlogDescription() + " " + blog.getDate());
		}
		return list;

	}
}
