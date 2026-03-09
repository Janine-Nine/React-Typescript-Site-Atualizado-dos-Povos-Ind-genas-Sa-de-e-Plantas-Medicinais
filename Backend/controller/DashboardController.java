@RestController
@RequestMapping("/dashboard")
public class DashboardController {

@Autowired
PlantaRepository plantaRepository;

@GetMapping("/stats")
public Map<String, Object> stats(){

Map<String,Object> dados = new HashMap<>();

dados.put("totalPlantas", plantaRepository.count());

return dados;

}

}