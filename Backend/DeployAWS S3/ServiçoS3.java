public String upload(MultipartFile file){

PutObjectRequest request = PutObjectRequest.builder()
.bucket("povos-indigenas-images")
.key(file.getOriginalFilename())
.build();

s3.putObject(request,
RequestBody.fromBytes(file.getBytes()));

return "https://s3.amazonaws.com/povos-indigenas-images/" + file.getOriginalFilename();

}