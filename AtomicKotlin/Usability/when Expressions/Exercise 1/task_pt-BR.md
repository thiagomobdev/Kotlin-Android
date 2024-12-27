## expressões `when` (#1)

Crie uma função `cloudiness(cloudPercent: Int)` que retorna uma descrição com base na porcentagem de nebulosidade: "Nublado" (quando `cloudPercent` está no intervalo 81..100), "Predominantemente Nublado" (61..80), "Parcialmente Ensolarado" (41..60), "Predominantemente Ensolarado" (21..40) e "Ensolarado" (0..20). Se o argumento não estiver no intervalo 0..100, lance `IllegalArgumentException`.