package pt.com.altice.labseq.service.impl;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import pt.com.altice.labseq.service.LabSeqService;


@Service
public class LabSeqServiceImpl implements LabSeqService {
	
	private static final Map<Integer, Integer> memo = new HashMap<>();
	
	public int calculateLabSeq(int n) {
		
		if (n == 0 || n == 2) return 0;
        else if (n == 1 || n == 3) return 1;
		
        if (memo.containsKey(n)) {
            return memo.get(n);
        } else {
            int result = calculateLabSeq(n - 4) + calculateLabSeq(n - 3);
            memo.put(n, result);
            return result;
        }
	}

}
