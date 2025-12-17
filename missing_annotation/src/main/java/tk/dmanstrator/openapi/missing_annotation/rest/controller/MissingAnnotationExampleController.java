package tk.dmanstrator.openapi.missing_annotation.rest.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import tk.dmanstrator.openapi.missing_annotation.api.MissingAnnotationExampleApi;
import tk.dmanstrator.openapi.missing_annotation.model.FixedVersion;
import tk.dmanstrator.openapi.missing_annotation.model.MyObject;
import tk.dmanstrator.openapi.missing_annotation.model.SemanticVersion;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MissingAnnotationExampleController implements MissingAnnotationExampleApi {


    @Override
    public ResponseEntity<MyObject> findObjectByCustomVersionInQuery(SemanticVersion version) {
        final MyObject myObject = createObjectFromSemanticVersion(version);
        return ResponseEntity.ok(myObject);
    }

    @Override
    public ResponseEntity<MyObject> findObjectByCustomVersions(List<@Valid SemanticVersion> versions) {
        final String versionsAsStr = versions.stream()
                .map(v -> String.format("%d.%d.%d", v.getMajor(), v.getMinor(), v.getPatch()))
                .collect(Collectors.joining(", "));
        final MyObject myObject = new MyObject()
                .title("Found versions.")
                .description(versionsAsStr);
        return ResponseEntity.ok(myObject);
    }

    @Override
    public ResponseEntity<MyObject> findObjectByFixedVersion(FixedVersion version) {
        final MyObject myObject = new MyObject()
                .title("Found fixed version: " + version.getValue());
        return ResponseEntity.ok(myObject);
    }

    @Override
    public ResponseEntity<MyObject> findObjectByCustomVersionInPath(SemanticVersion version) {
        final MyObject myObject = createObjectFromSemanticVersion(version);
        return ResponseEntity.ok(myObject);
    }

    private MyObject createObjectFromSemanticVersion(SemanticVersion version) {
        final MyObject myObject;
        if (version.getPatch() == null && version.getMinor() == null && version.getMajor() == null)
            myObject = new MyObject().title("All version attributes are null.");
        else {
            myObject = new MyObject().title("Version was properly converted.");
        }

        return myObject;
    }

}
