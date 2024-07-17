package one.digitalinnovation.gof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import one.digitalinnovation.gof.model.Setor;

@FeignClient(name = "viaNomeSetorService", url = "http://localhost:8080")
public interface ViaNomeSetorService {

    @GetMapping("/{setor}/json/")
    Setor consultaSetor(@PathVariable("setor") String setor);
}
