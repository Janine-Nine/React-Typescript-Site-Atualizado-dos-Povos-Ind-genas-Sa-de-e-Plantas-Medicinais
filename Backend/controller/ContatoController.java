@RestController
@RequestMapping("/contato")
@CrossOrigin("*")
public class ContatoController {

    @Autowired
    private ContatoRepository repository;

    @PostMapping
    public Contato enviar(@RequestBody Contato contato){
        return repository.save(contato);
    }
}