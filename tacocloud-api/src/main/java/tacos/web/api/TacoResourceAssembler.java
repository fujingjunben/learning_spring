package tacos.web.api;

import org.springframework.hateoas.server.RepresentationModelAssembler;
import tacos.Taco;

public class TacoResourceAssembler extends RepresentationModelAssembler<Taco, TacoResource> {
    @Override
    public TacoResource toModel(Taco entity) {
    }
}
