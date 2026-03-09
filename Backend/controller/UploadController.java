@RestController
@RequestMapping("/upload")
public class UploadController {

@PostMapping
public String upload(@RequestParam("file") MultipartFile file) {

String nomeArquivo = UUID.randomUUID() + file.getOriginalFilename();

Path caminho = Paths.get("uploads/" + nomeArquivo);

Files.copy(file.getInputStream(), caminho);

return "http://localhost:8080/uploads/" + nomeArquivo;
}
}