import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
      home:Scaffold(
        backgroundColor: Colors.blue[200],
        appBar: AppBar(
          title: Text('I Am Poor'),
          backgroundColor: Colors.blue,
        ),
        body: Center(
          child: Image(
            image: AssetImage('images/bitcoin.png'),
          ),
        ),
      ),
    ),
  );
}
