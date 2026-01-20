
package cz.ivosahlik.ml.controller;

import cz.ivosahlik.ml.features.PlayerContext;
import cz.ivosahlik.ml.scoring.RiskResult;
import cz.ivosahlik.ml.scoring.RiskScoringService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/risk")
public class RiskController {

    private final RiskScoringService service;

    @PostMapping("/evaluate")
    public RiskResult evaluate(@RequestBody PlayerContext ctx) {
        return service.evaluate(ctx);
    }
}
