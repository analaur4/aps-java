* Reader

Criado a classe ControlStory para, para manipular as interações de dados entre o fonte e o backend

na criação do objeto primeiro instanciamos o caminho até o json,
e na função scene instanciamos a cena referente ao dialogo

Os valores que podem ser passados para o metodo "DataString" referente a base de dados atuais são:

  "message",(resposta obtida)
  "person", (personagem com quem se conversa)
  "obs", (observações)
  
  com retorno de valor do tipo String
    
O metodo "DataArray" podemos passar como paremetros "field"
    
   options (opções de resposta),
   way (caminho referente a resposta)
   
   Com retorno volor do tipo ArrayList
    

*   simplr_json

biblioteca de leitura de arquivos json
    