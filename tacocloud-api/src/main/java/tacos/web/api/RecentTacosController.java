package tacos.web.api;

import org.springframework.data.rest.webmvc.RepositoryRestController;
import tacos.data.TacoRepository;

@RepositoryRestController
public class RecentTacosController {

    private TacoRepository tacoRepo;

    public RecentTacosController(TacoRepository tacoRepo) {
        this.tacoRepo = tacoRepo;
    }

    public ResponseEntity<Resources<TacoResource>> recentTacos() {

    }
}
