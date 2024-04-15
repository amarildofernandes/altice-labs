package pt.com.altice.labseq.controller;

import org.springframework.http.ResponseEntity;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Labseq")
public interface LabSeqController {
	
	@Operation(summary = "Get lab sequence")
	ResponseEntity<?> labSeq(int n);

}
