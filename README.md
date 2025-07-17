<h1>Conversor de Moedas - Projeto Java</h1>

  <p>Este é um programa criado no Replit que funciona como um conversor de moedas, usando a API ExchangeRate-API para buscar os valores das cotações em tempo real.</p>

  <p>O projeto foi desenvolvido seguindo os passos do curso ONE da Oracle + Alura.</p>

  <h2>Como funciona:</h2>
  <p>Ao executar o programa, ele mostra 6 opções de conversão:</p>
  <ol>
    <li>Dólar para Real</li>
    <li>Real para Dólar</li>
    <li>Euro para Real</li>
    <li>Real para Euro</li>
    <li>Peso argentino para Real</li>
    <li>Real para Peso argentino</li>
  </ol>
  <p>Você escolhe uma das opções e digita o valor que quer converter. O programa então busca a cotação atual e mostra o resultado convertido.</p>

  <h2>Como configurar a chave da API:</h2>
  <p>Para o programa funcionar corretamente, é necessário gerar uma chave de API gratuita no site da ExchangeRate-API:<br>
    <a href="https://www.exchangerate-api.com" target="_blank">https://www.exchangerate-api.com</a>
  </p>

  <p>Depois que você gerar sua chave:</p>
  <ol>
    <li>Altere o valor da variável <code>API_KEY</code> no <code>Conversion.java</code> para a sua chave API.</li>
  </ol>

  <pre><code>API_KEY="SUA_CHAVE_AQUI"</code></pre>

  <h2>Requisitos:</h2>
  <ul>
    <li>Java 11 ou superior</li>
    <li>Biblioteca GSON (<code>gson-2.10.1.jar</code>) — já está incluída no projeto</li>
  </ul>
