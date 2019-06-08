grammar gramatica;
@header {
    import apicreatorxml.Writer;
    import apicreatorxml.Node;
    import apicreatorxml.Paso;
}
@members { 
    private Writer writer= new Writer("./gramatica.txt","./descendent","./cadenaDePrueba.txt",true);

}

exp  returns [Exp expO] 
    :   {
        Paso paso=writer.addPasoPrimero("EXP", null, null);
        Node node=writer.addNode("EXP", false,false);
        
    } 

    bO=b[node,true]  aO=a[((ExpContext)_localctx).bO.bO.getResult(),node,true,false] puntocoma[node,false] {
        ((ExpContext)_localctx).bO.bO.getPaso().setRegla("EXP::= B A ;");
        Exp expO=new Exp();
        expO.setResult(((ExpContext)_localctx).aO.aO.getResult());
        System.out.println(((ExpContext)_localctx).aO.aO.getResult());
        _localctx.expO=expO;   
        writer.writeXML();
        }
    ;
a [Integer her,Node nodeAnt,Boolean haveBrother,Boolean a1] returns [A aO]
    : { 
        Paso paso;
        Node node;
        if(a1){
            node=writer.addNode("A1", false, haveBrother);
            paso=writer.addPaso(false,null,"A1","A1.valor="+her+" A1.result=null", null, nodeAnt.getId());
        }
        else{
            node=writer.addNode("A", false, haveBrother);
            paso=writer.addPaso(false,null,"A","A.valor="+her+" A.result=null", null, nodeAnt.getId());
        }
        node.setFatherNode(nodeAnt);
        
        
        }
        masO=mas[node,true] bO=b[node,true]  aeO=a[((AContext)_localctx).bO.bO.getResult()+her,node,false,true] {
        ((AContext)_localctx).masO.m.getPaso().setRegla("A::= + B A1");
        A aO=new A();
        aO.setResult(((AContext)_localctx).aeO.aO.getResult());
        aO.setPaso(paso);
        aO.setNode(node);
        _localctx.aO=aO;
        
        } 
    
    |{
        Paso paso;
        Node node;
        if(a1){
            node=writer.addNode("A1", false, haveBrother);
            paso=writer.addPaso(false,null,"A1","A1.valor="+her+" A1.result=null", null, nodeAnt.getId());
        }
        else{
            node=writer.addNode("A", false, haveBrother);
            paso=writer.addPaso(false,null,"A","A.valor="+her+" A.result=null", null, nodeAnt.getId());
        }
        node.setFatherNode(nodeAnt);
        Paso pasoL=writer.addPaso(true,null,"λ", null, "A::= λ",paso.getId());
        Node nodeL=writer.addNode("λ", true,false);
        nodeL.setFatherNode(node);
        } 
    {

        A aO=new A();
        aO.setResult(her);
        aO.setPaso(paso);
        Node nodeAux=node;
        while(!nodeAux.getHaveBrother()){

            pasoL.getChangedNodes().add(nodeAux.getId());
            Paso pasoAux =writer.getStep(nodeAux.getId());
            String values=pasoAux.getValor();
            
            values=values.replace("null",aO.getResult().toString() );
            pasoL.getChanges().add(values); 
            nodeAux=nodeAux.getFatherNode();
        }
            pasoL.getChangedNodes().add(nodeAux.getId());
            Paso pasoAux =writer.getStep(nodeAux.getId());
            String values=pasoAux.getValor();
            
            values=values.replace("null",aO.getResult().toString() );
            pasoL.getChanges().add(values); 
            _localctx.aO=aO;
        
        }
    ;
b [Node nodeAnt,Boolean haveBrother]  returns [B bO]
    :{
        Paso paso=writer.addPaso(false,null,"B", "B.result=null", null,nodeAnt.getId());
        Node node=writer.addNode("B", false,haveBrother);
        node.setFatherNode(nodeAnt);
      
    } 
    numO=numb[node,true] cO=c[((BContext)_localctx).numO.numO.getValue(),node,false,false] {
        ((BContext)_localctx).numO.numO.getPaso().setRegla("B::= num C");
        B bO=new B();
        bO.setResult(((BContext)_localctx).cO.cO.getResult());
        bO.setPaso(paso);
        _localctx.bO=bO;}
    ;
c [Integer her,Node nodeAnt,Boolean haveBrother,Boolean c1]   returns [C cO]
    :{
        Paso paso;
        Node node;
        if(c1){
            node=writer.addNode("C1", false, haveBrother);
            paso=writer.addPaso(false,null,"C1", "C1.valor="+her+"C1.result=null", null,nodeAnt.getId());
        }
        else{
            node=writer.addNode("C", false, haveBrother);
            paso=writer.addPaso(false,null,"C", "C.valor="+her+"C.result=null", null,nodeAnt.getId());
        }
        node.setFatherNode(nodeAnt);
        
    }  
    porO=por[node,true] numO=numb[node,true]  ceO=c[her*((CContext)_localctx).numO.numO.getValue(),node,false,true] {
        ((CContext)_localctx).porO.pr.getPaso().setRegla("C::= * num C1");
        C cO=new C();
        cO.setResult(((CContext)_localctx).ceO.cO.getResult());
        cO.setPaso(paso);
        _localctx.cO=cO;} 
    | {
        
        Paso paso;
        Node node;
        if(c1){
            node=writer.addNode("C1", false, haveBrother);
            paso=writer.addPaso(false,null,"C1", "C1.valor="+her+" C1.result=null", null,nodeAnt.getId());
        }
        else{
            node=writer.addNode("C", false, haveBrother);
            paso=writer.addPaso(false,null,"C", "C.valor="+her+" C.result=null", null,nodeAnt.getId());
        }
        node.setFatherNode(nodeAnt);
        paso=writer.addPaso(true,null,"λ", null, "C::= λ",paso.getId());
        Node nodeL=writer.addNode("λ", true,false);
        nodeL.setFatherNode(node);
        } 
        {
        C cO=new C();

        cO.setResult(her);
        cO.setPaso(paso);
        Node nodeAux=node;
        while(!nodeAux.getHaveBrother()){

            paso.getChangedNodes().add(nodeAux.getId());
            Paso pasoAux =writer.getStep(nodeAux.getId());
            String values=pasoAux.getValor();
           
            
            values=values.replace("null",cO.getResult().toString() );
            paso.getChanges().add(values); 
            nodeAux=nodeAux.getFatherNode();
        }
            paso.getChangedNodes().add(nodeAux.getId());
            Paso pasoAux =writer.getStep(nodeAux.getId());
            String values=pasoAux.getValor();
            
            
            values=values.replace("null",cO.getResult().toString() );
            paso.getChanges().add(values); 
        
        _localctx.cO=cO;}

;

puntocoma [Node nodeAnt,Boolean haveBrother] returns [PuntoComa pc]
    : ';'{
        Paso paso=writer.addPaso(true,";",";", null, null,nodeAnt.getId());
        Node node=writer.addNode(";", true,haveBrother);
        PuntoComa pc=new PuntoComa();
        node.setFatherNode(nodeAnt);
        pc.setPaso(paso);
        _localctx.pc=pc;
    }
    ;
mas [Node nodeAnt,Boolean haveBrother] returns [Mas m]
    : '+'{
        {
        Paso paso=writer.addPaso(true,"+","+", null, null,nodeAnt.getId());
        Node node=writer.addNode("+", true,haveBrother);
        Mas m=new Mas();
        node.setFatherNode(nodeAnt);
        m.setPaso(paso);
        _localctx.m=m;
    }
    }
    ;
por [Node nodeAnt,Boolean haveBrother]  returns [Por pr]
    : '*'{
        Paso paso=writer.addPaso(true,"*","*", null, null,nodeAnt.getId());
        Node node=writer.addNode("*", true,haveBrother);
        Por pr=new Por();
        node.setFatherNode(nodeAnt);
        pr.setPaso(paso);
        _localctx.pr=pr;
    }
    ;
numb [Node nodeAnt,Boolean haveBrother]  returns [Num numO]
    : Number {
        Paso paso=writer.addPaso(true,this._ctx.getText(),"num", "num.vlex="+this._ctx.getText(), null,nodeAnt.getId());
        Node node= writer.addNode("num", true,haveBrother);
        Num numO=new Num();
        numO.setValue(Integer.parseInt(this._ctx.getText()));
        numO.setPaso(paso);
        node.setFatherNode(nodeAnt);
        _localctx.numO=numO;
    }
    ;
Number 
    : ('0'..'9')+ {
        
        System.out.println(getText());
        }
    ;
