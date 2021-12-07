package telran.color.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import telran.color.dto.ColorsDto;

public class ImmageColorAppl {
    final static String TOKEN = "Basic YWNjX2Q3NTE0YzIyNjFmODJmYToyYjg0MmRlYjJiNjVhMDViMmQ4N2FiOGY1M2NhMWNiMw==";
    static RestTemplate restTemplate = new RestTemplate();

    public static void main(String[] args) {
	String httpUrl = "https://api.imagga.com/v2/colors";
	UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(httpUrl)
		.queryParam("image_url", "https://imagga.com/static/images/tagging/wind-farm-538576_640.jpg");
	HttpHeaders headers = new HttpHeaders();
	headers.add("Authorization", TOKEN);
	RequestEntity<String> requestEntity = 
		new RequestEntity<>(headers , HttpMethod.GET, builder.build().toUri());
	ResponseEntity<ColorsDto> responseEntity = restTemplate.exchange(requestEntity, ColorsDto.class);
	System.out.println("color name" + "\t" + "ent color name" + "\t" + "coverage percent");
	System.out.println("\t" + "\t" +"Background");
	System.out.println();
	responseEntity.getBody().getResult().getColors().getBackground_colors().forEach(System.out::println);
	System.out.println();
	System.out.println("\t" + "\t" +"Foreground");
	System.out.println();
	responseEntity.getBody().getResult().getColors().getForeground_colors().forEach(System.out::println);
	System.out.println();
	System.out.println("\t" + "\t" +"Image");
	System.out.println();
	responseEntity.getBody().getResult().getColors().getImage_colors().forEach(System.out::println);
/*new*/ 

    }

}
