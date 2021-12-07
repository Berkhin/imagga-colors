package telran.color.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class DefaultDto {
    String closest_palette_color;
    String closest_palette_color_parent;
    double percent;
    
    @Override
    public String toString() {
	return closest_palette_color + "\t" + "\t" + closest_palette_color_parent  + "\t" + "\t" + percent;
    }
}
