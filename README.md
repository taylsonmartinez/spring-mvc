SpringMVC 
=========


Separação de responsabilidades

Muitos sistemas tornam-se difíceis de manter porque existem trechos de código que tem muita responsabilidade, ou seja, fazem muita coisas.
Um bom exemplo desse problema são as páginas JSPs que contém, além de código HTML, código Java e código SQL. Tudo isso é difícil de manter. O código fica espalhado e muitas vezes repetidos.
Uma possível solução para o problema é tentar separar as diversas tarefas citadas acima, da seguinte forma:
Quando um usuário interage com o sistema, ele executa uma ação e obtém visualmente o resultado da mesma. Isto é, primeiro uma regra de negócios é executada (adicionar algo, atualizar algo, buscar algo), e depois informações são mostradas na tela.


Frameworks MVC

O padrão MVC tem se mostrado uma maneira educada de separar essas camadas, e por isso sua utilização é crescente no mercado. Muitos frameworks, como Spring MVC ou VRaptor inclusive de outras linguagens de programação, como é o caso do Ruby on Rails e Asp.Net MVC, adotam o MVC como solução para separar responsabilidades.
Entender MVC é fundamental para desenvolver na Web, independente da tecnologia ou framework escolhido.
