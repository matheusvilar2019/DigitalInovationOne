using DesafioPOO.Models;

// TODO: Realizar os testes com as classes Nokia e Iphone

Console.WriteLine("====================");
Console.WriteLine("======= NOKIA ======");
Console.WriteLine("====================");

Smartphone nokia = new Nokia("11977550000", "Tijolao", "S12345687852", 512);
nokia.Ligar();
nokia.ReceberLigacao();
nokia.InstalarAplicativo("Duolingo");



Console.WriteLine("====================");
Console.WriteLine("====== IPHONE ======");
Console.WriteLine("====================");

Smartphone iphone = new Iphone("11977552222", "Iphone 14", "652654626542", 10000);
iphone.Ligar();
iphone.ReceberLigacao();
iphone.InstalarAplicativo("Duolingo");
