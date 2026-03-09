public String gerarToken(String email){

return Jwts.builder()
.setSubject(email)
.setIssuedAt(new Date())
.setExpiration(new Date(System.currentTimeMillis()+86400000))
.signWith(SignatureAlgorithm.HS256, SECRET)
.compact();

}