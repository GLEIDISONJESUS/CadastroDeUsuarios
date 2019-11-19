<?php
//Variaveis para os números
$num1 = $_GET ["num1"];
$num2 = $_GET['num2'];

$soma = $num1 + $num2;
$sub = $num1 - $num2;
$mult = $num1 * $num2;
$div = $num1 / $num2;
?>
<!DOCTYPE html>

<html>
    <head>
        <title>Calculadora</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- FONT ICON -->
        <link rel="stylesheet" type="text/css" href="css/fontawesome.all.min.css">


        <!-- ESTILOS -->  
        <link rel="stylesheet" href="style3.css">

    </head>

    <body>
        <div class="content6">
            <h1>Calculadora</h1>
            <form>
                <label>Número 1:</label>
                <input name="num1"/>  
                <br>
                <label>Número 2:</label>
                <input name="num2"/>
                <br>
                <input type="submit"/>
            </form>
            <h2>Resultados</h2>
            <p>Soma = <?php echo $soma; ?></p>
            <p>Subtração = <?php echo $sub; ?></p></p>
            <p>Multiplicação = <?php echo $mult; ?></p></p>
            <p>divisão = <?php echo $div; ?></p></p>
            <a href="../index.html">-----------Home-----------</a>
        </div>
    </body>
</html>

