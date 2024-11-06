<h1>Conversor de Temperatura: Celsius para Fahrenheit em Java</h1>

<p>Este projeto é uma aplicação em Java que permite ao usuário inserir uma temperatura em graus Celsius e, utilizando um método específico, converter essa temperatura para Fahrenheit. O programa utiliza duas classes para organizar a lógica de conversão e a interação com o usuário.</p>

<h2>Estrutura do Projeto</h2>

<p>O projeto é composto pelas seguintes classes:</p>

<ol>
    <li><strong>Classe <code>Main</code></strong>: Responsável pela interação com o usuário. Solicita que o usuário insira a temperatura em graus Celsius, chama o método de conversão na classe <code>conversor</code> e exibe o resultado em Fahrenheit.</li>
    <li><strong>Classe <code>conversor</code></strong>: Contém o método <code>converte</code>, que realiza o cálculo da temperatura em Fahrenheit com base na temperatura em Celsius recebida. A fórmula utilizada é: (Celsius × 9/5) + 32.</li>
</ol>

<h3>Detalhes das Classes</h3>

<ul>
    <li><strong>Classe <code>Main</code></strong>
        <ul>
            <li>Cria uma instância de <code>Scanner</code> para capturar a entrada de dados do usuário.</li>
            <li>Solicita ao usuário uma temperatura em graus Celsius.</li>
            <li>Chama o método <code>converte</code> da classe <code>conversor</code> e armazena o resultado.</li>
            <li>Exibe o valor convertido em Fahrenheit ao usuário.</li>
        </ul>
    </li>
    <li><strong>Classe <code>conversor</code></strong>
        <ul>
            <li>Contém o método <code>converte</code>, que recebe a temperatura em Celsius como parâmetro.</li>
            <li>Calcula e retorna o valor equivalente em Fahrenheit.</li>
        </ul>
    </li>
</ul>

<h2>Objetivos do Projeto</h2>

<p>Os principais objetivos deste projeto incluem:</p>

<ol>
    <li><strong>Implementação de Conversão de Temperaturas</strong>: Demonstrar como converter uma temperatura de Celsius para Fahrenheit.</li>
    <li><strong>Uso de Métodos para Modularização</strong>: Aplicar uma abordagem modular para organizar a lógica de conversão separadamente.</li>
    <li><strong>Interação com o Usuário</strong>: Permitir que o usuário insira uma temperatura e receba o valor convertido de forma clara.</li>
</ol>

<h2>Funcionalidades</h2>

<ul>
    <li><strong>Entrada de Dados</strong>: O programa solicita ao usuário uma temperatura em Celsius.</li>
    <li><strong>Conversão de Temperatura</strong>: A classe <code>conversor</code> realiza a conversão para Fahrenheit.</li>
    <li><strong>Exibição de Resultado</strong>: O programa exibe o valor convertido em Fahrenheit.</li>
</ul>

<h2>Conclusão</h2>

<p>Este projeto implementa uma aplicação simples em Java para converter temperaturas de Celsius para Fahrenheit. A estrutura modular permite que a classe <code>Main</code> gerencie a interação com o usuário, enquanto a classe <code>conversor</code> encapsula a lógica de conversão. A organização do código em métodos separados facilita a leitura e reutilização, sendo um exemplo prático de boas práticas de programação em Java.</p>
