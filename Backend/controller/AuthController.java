@RestController
@RequestMapping("/auth")
public class AuthController {

private final JwtService jwtService;

public AuthController(JwtService jwtService){
this.jwtService = jwtService;
}

@PostMapping("/login")
public String login(@RequestBody Usuario usuario){

return jwtService.gerarToken(usuario.getEmail());

}

}