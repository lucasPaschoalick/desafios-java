# Desafios Target

Desafios referentes a vaga de estágio.

## Execução

Para executar as questões é necessário ter:
- Java 11;
<br><br>
- Executar o projeto em alguma IDE (Eclipse), ou executar na linha de comando;
<br><br>
- Para executar na linha de comando é necessário ter o maven instalado e executar os seguintes comandos:

```bash
mvn compile
```

```bash
mvn exec:java -Dexec.mainClass=br.com.target.exerciciosEstagio.Desafios
```

## Respostas das questões discursivas

### 1- 
O valor da variável SOMA ao final do processamento será de 91.

### 3-
a)  9	
b)  128	
c)  49	
d)  100	
e)  13	
f)  200

### 4- 
c)  
Para calcular o ponto de encontro entre os 2 veículos, admitindo Ribeirão Preto como ponto de referência, temos que:
Para o carro que sai do ponto de referência:
```bash
distCarro = velocidadeCarro * tempoCarro;
```	

onde,
```bash
velocidadeCarro = 110 km/h;
```

Para o caminhão que sai a uma distância de 100km do ponto de referência:
```bash
distCaminhao = 100 - velocidadeCaminhao * tempoCaminhao;
```

onde,
```bash
velocidadeCaminhao = 80km/h;
```

Tempo de viagem do caminhao com pedagios:
```bash
tempoCaminhao = 100/80;
tempoCaminhao = 1,25h;
tempoCaminhaoComPedagios = 1,25h + 0,17h;
tempoCaminhaoComPedagios = 1,42h;
```

Velocidade média considerando 10 min a mais dos pedágios:
```bash
velocidadeMediaCaminhao = 100km/1,42h;
velocidadeMediaCaminhao = 70,6 km/h;
```

Para chegar no ponto de encontro é necessário igualar as equações do carro e do caminhão em relação ao tempo:
```bash
tempoCarro = distCarro/velocidadeCarro
tempoCaminhao = (distCaminhao-100)/-velocidadeCaminhao;
```

Para achar o ponto de encontro:
```bash
distCarro = distCaminhao = dist;
dist/velocidadeCarro = (dist-100)/-velocidadeMediaCaminhao;
-velocidadeMediaCaminhao * dist = velocidadeCarro * (dist-100);
dist = (velocidadeCarro*100)/velocidadeCarro + velocidadeMediaCaminhao
dist = (110 * 100) / (110 + 70,6);
dist = 60,9 km;
```