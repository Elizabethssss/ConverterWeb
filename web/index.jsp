<%--
  Created by IntelliJ IDEA.
  User: Lizz
  Date: 11/30/2019
  Time: 2:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Converter</title>
  <link rel="stylesheet" href="index.css">
</head>
<body>
<form method="get" action="convertServlet">
  <div class="work-zone">
    <div class="number_in">
      <label class="label-input">Enter number: </label>
      <input type="text" name="input" value="${input}">
    </div>

    <div class="radio">
      <div class="radio_in">
        <p class="p_in">FROM</p>
        <div class="in">
          <label>Binary</label>
          <input type="radio" value="binary_in" name="from" ${from == 'binary_in' ? 'checked' : ''}><br>
        </div>
        <div class="in">
          <label>Ternary</label>
          <input type="radio" value="ternary_in" name="from" ${from == 'ternary_in' ? 'checked' : ''}><br>
        </div>
        <div class="in">
          <label>Octal</label>
          <input type="radio" value="octal_in" name="from" ${from == 'octal_in' ? 'checked' : ''}><br>
        </div>
        <div class="in">
          <label>Decimal</label>
          <input type="radio" value="decimal_in" name="from" ${from == 'decimal_in' ? 'checked' : ''}><br>
        </div>
        <div class="in">
          <label>Hexadecimal</label>
          <input type="radio" value="hexadecimal_in" name="from" ${from == 'hexadecimal_in' ? 'checked' : ''}><br>
        </div>
      </div>

      <div class="radio_out">
        <p class="p_out">TO</p>

        <input type="radio" value="binary_out" name="to" ${to == 'binary_out' ? 'checked' : ''}>
        <label>Binary</label><br>

        <input type="radio" value="ternary_out" name="to" ${to == 'ternary_out' ? 'checked' : ''}>
        <label>Ternary</label><br>

        <input type="radio" value="octal_out" name="to" ${to == 'octal_out' ? 'checked' : ''}>
        <label>Octal</label><br>

        <input type="radio" value="decimal_out" name="to" ${to == 'decimal_out' ? 'checked' : ''}>
        <label>Decimal</label><br>

        <input type="radio" value="hexadecimal_out" name="to" ${to == 'hexadecimal_out' ? 'checked' : ''}>
        <label>Hexadecimal</label><br>
      </div>
    </div>

    <div class="button">
      <input type="submit" value="Convert" class="res-button">
    </div>

    <div class="number_out">
      <label for="output" class="label-input">Result: </label>
      <input type="text" id="output" name="output" value="${output}">
    </div>
  </div>
</form>
</body>
</html>