Kraven på applikationen

Applikationen skall simulera pengahanteringen i en varuautomat. Automaten kräver ett visst belopp mellan 1:- och 1000:-, och kunden skall sen kunna betala med mynt och sedlar tills summan av alla mynt och sedlar är lika med eller större än det krävda beloppet. Om summan överstiger det krävda beloppet skall kunden få tillbaka rätt växel.

Det krävda beloppet (varans pris) skall slumpas fram varje gång, och skall ligga mellan 1 och 1000 kornor (inga ören).

För att automaten skall likna verkligheten så mycket som möjligt är det bara tillåtet att mata in ett mynt eller en sedel åt gången. 'Inmatningen' sker lämpligast genom att användaren anger en valör, exempelvis talet 10 för ett tiokronorsmynt. Tillåtna valörer vid inmatning och för växel är: 1:-, 5:-, 10:-, 20:-, 50:-, 100:-, 500:-. Det går alltså inte att mata in t.ex. tre kronor på en gång utan det måste ske med en krona i taget.

Växeln skall betalas ut med minimalt antal sedlar och mynt, dvs det är inte tillåtet att betala ut all växel i form av t.ex. enkronor.

Ditt program måste kontrollera att kunden matar in sedlar och mynt med giltiga valörer, däremot behöver det inte klara av något annat än siffror.

Exempel: (kundens inmatning i fetstil)

Välkommen till Automaten !
Du har valt att köpa en av mina exklusiva varor för 22 kronor.
Kvar att betala 22 kronor.
Inmatning: 10
Kvar att betala 12 kronor.
Inmatning: 12
Felaktig inmatning. Giltiga valörer är 1, 5, 10, 20, 50, 100, 500 kr.
Kvar att betala 12 kronor.
Inmatning: 10
Kvar att betala 2 kronor.
Inmatning: 50
Automaten är nöjd. Växeln blir två tjugokronorssedlar, en femma och tre enkronor.
Dina programutskrifter behöver inte se ut exakt som i exemplet, men grundprinciperna skall vara desamma.