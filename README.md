<!-- Visualizador online: https://stackedit.io/ -->
 ![Logo da UDESC Alto Vale](http://www1.udesc.br/imagens/id_submenu/2019/marca_alto_vale_horizontal_assinatura_rgb_01.jpg)

---

# Procurar Palavras em Arquivos com Threads

Atividade desenvolvida para a disciplina de Desenvolvimento de Sistemas Paralelos e Distribuídos do [Centro de Educação Superior do Alto Vale do Itajaí (CEAVI/UDESC)](https://www.udesc.br/ceavi)<br>
Desenvolver um programa que determina a quantidade de ocorrências de uma palavra (em inglês)
em arquivos de texto.

# Sumário
* [Equipe](#equipe)
* [Atividade](#atividade)
* [Resultados](#resultados)

## [Equipe](#equipe)
 - [**Rodrigo Souza Tassoni**](mailto:tazzsoni@gmail.com) - [TazzSoni](https://github.com/tazzsoni)

## [Atividade](#atividade)

Desenvolver um programa que determina a quantidade de ocorrências de uma palavra (em inglês)
em arquivos de texto. Os arquivos texto estão disponíveis neste link: [CasosTestePalavrasArquivos.zip](https://udesc-my.sharepoint.com/:u:/g/personal/03999436921_udesc_br/EYhp_tN0oU1Jnt-FWQaDZD8BYxT9_ihXJwlJWz5ZTB7pGg?e=opRV7a)
(tamanho do arquivo: 250 MB). O dataset é formado por 250 arquivos texto.<br>
Faça o Download do dataset e coloque a pasta no diretório raíz da aplicação.


| Palavra  |  Quantidade  |
| ------------------- | ------------------- |
|  passenger |  33579 |
|  dramatic |  33565 |
|  original |  33438 |

<br>

Implemente uma versão sem e outra com threads. A thread deve abrir um (ou vários) arquivos texto e
determinar a quantidade de ocorrências da palavra.
Elabore uma planilha com os tempos de execução para 3 diferentes palavras e com diferentes
quantidades de threads. Em cada caso de teste deve executar 5 vezes, coletar o tempo de execução, e
calcular a média, elaborando uma planilha conforme modelo a seguir.

![image](https://user-images.githubusercontent.com/45270751/123840805-2f715900-d8e5-11eb-9e15-c06e2ae535eb.png)

## [Resultados](#resultados)
![image](https://user-images.githubusercontent.com/45270751/123841037-752e2180-d8e5-11eb-880a-7c19be6dee2e.png)
![image](https://user-images.githubusercontent.com/45270751/123841092-870fc480-d8e5-11eb-9e31-53a040a78a8b.png)
![image](https://user-images.githubusercontent.com/45270751/123841152-9858d100-d8e5-11eb-98e6-ad92aea949ee.png)
