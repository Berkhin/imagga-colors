package telran.color.dto;

import java.util.List;

import lombok.Getter;
import lombok.ToString;
@Getter
@ToString
public class Colors {
    List<DefaultDto> background_colors;
    List<DefaultDto> foreground_colors;
    List<DefaultDto> image_colors;
}
