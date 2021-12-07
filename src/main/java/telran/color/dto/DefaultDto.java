package telran.color.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class DefaultDto {
    @JsonAlias({ "closest_palette_color_parent" })
    String color_parent;
    @JsonAlias("closest_palette_color")
    String color;

    double percent;

    @Override
    public String toString() {
	return color + "\t" + "\t" + color_parent + "\t" + "\t" + percent;
    }
}
