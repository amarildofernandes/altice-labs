package pt.com.altice.labseq.controller.impl;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.com.altice.labseq.controller.LabSeqController;
import pt.com.altice.labseq.service.LabSeqService;


@RestController
@RequestMapping("/labseq")
public class LabSeqControllerImpl implements LabSeqController {

	private final LabSeqService labSeqService;

	public LabSeqControllerImpl(LabSeqService labSeqService) {
		this.labSeqService = labSeqService;
	}

	@Override
	@GetMapping("/{n}")
	@Cacheable("labseqCache")
	public ResponseEntity<?> labSeq(@PathVariable int n) {
		if (n < 0) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("O valor de 'n' não pode ser negativo.");
		}
		int result = labSeqService.calculateLabSeq(n);
		return ResponseEntity.ok(result);
	}

}
