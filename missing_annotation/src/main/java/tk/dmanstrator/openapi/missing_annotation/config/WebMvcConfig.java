package tk.dmanstrator.openapi.missing_annotation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import tk.dmanstrator.openapi.missing_annotation.rest.converter.StringToFixedVersionConverter;
import tk.dmanstrator.openapi.missing_annotation.rest.converter.StringToSemanticVersionConverter;

@EnableWebMvc
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(final FormatterRegistry registry) {
        registry.addConverter(new StringToFixedVersionConverter());
        registry.addConverter(new StringToSemanticVersionConverter());
    }

}
