package com.aitorgonzalez.microservices_eureka_gallery_client.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Gallery {
	private Integer id;
	private List<Object> images;
}
