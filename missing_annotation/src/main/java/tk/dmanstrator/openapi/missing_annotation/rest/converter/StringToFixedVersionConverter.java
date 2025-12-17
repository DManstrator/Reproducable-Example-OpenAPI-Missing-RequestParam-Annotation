package tk.dmanstrator.openapi.missing_annotation.rest.converter;

import org.springframework.core.convert.converter.Converter;
import tk.dmanstrator.openapi.missing_annotation.model.FixedVersion;

/**
 * Converts a String to a {@link FixedVersion}.
 */
public class StringToFixedVersionConverter implements Converter<String, FixedVersion> {

    @Override
    public FixedVersion convert(final String source) {
        // Dummy impl.
        return FixedVersion._1_0_0;
    }

}
