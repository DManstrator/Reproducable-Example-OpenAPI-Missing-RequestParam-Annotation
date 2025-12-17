package tk.dmanstrator.openapi.missing_annotation.rest.converter;

import org.springframework.core.convert.converter.Converter;
import tk.dmanstrator.openapi.missing_annotation.model.SemanticVersion;

/**
 * Converts a String to a {@link SemanticVersion}.
 */
public class StringToSemanticVersionConverter implements Converter<String, SemanticVersion> {

    @Override
    public SemanticVersion convert(final String source) {
        // Dummy impl.
        return new SemanticVersion(1, 2, 3);
    }

}
