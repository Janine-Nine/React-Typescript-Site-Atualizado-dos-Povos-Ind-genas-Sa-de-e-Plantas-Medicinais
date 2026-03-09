@RestController
@RequestMapping("/contato")
@CrossOrigin("*")
public class ContatoController {

private final ContatoRepository repository;

public ContatoController(ContatoRepository repository){
this.repository = repository;
}

@PostMapping
public Contato enviar(@RequestBody Contato contato){
return repository.save(contato);
}

}