---
title: signatures.sdf3
---

# `signatures.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/gradual-types/signatures.sdf3]

[pdmosses/stratego/stratego.lang/syntax/gradual-types/signatures.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/gradual-types/signatures.sdf3 "The source file on GitHub"

<div class="sdf3"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../terms.sdf3#gradual-types/signatures_64_88" id="gradual-types/signatures_7_31" title="Referenced at ../terms.sdf3 line 5">gradual-types/signatures</a>

<span class="keyword">imports</span>
  <a href="../../core/identifiers.sdf3#core/identifiers_7_23" id="core/identifiers_43_59" title="Defined at ../../core/identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../../core/signatures.sdf3#core/signatures_7_22" id="core/signatures_62_77" title="Defined at ../../core/signatures.sdf3 line 1">core/signatures</a>

<span class="keyword">context-free sorts</span> <a href="#Type_1238_1242" id="Type_98_102" title="Referenced at line 44; ../modules.sdf3 line 11; ../overlays.sdf3 line 13; ../strategies.sdf3 line 23; ../terms.sdf3 line 9; ../../deduplicated.sdf3 line 73">Type</a> <a href="#SortT_444_449" id="SortT_103_108" title="Referenced at line 18">SortT</a> <a href="#Dyn_658_661" id="Dyn_109_112" title="Referenced at line 25; ../../deduplicated.sdf3 line 78">Dyn</a>
<span class="keyword">context-free syntax</span>
  <span id="ConstType_135_144" title="Not referenced locally, nor via imports">ConstType</span>.<span class="cons_Constructor"><span id="ConstDynT_145_154" title="Not referenced locally, nor via imports">ConstDynT</span></span> = <a href="#Dyn_109_112" id="Dyn_157_160" title="Defined at line 7, 10">Dyn</a>
  <a href="#Dyn_658_661" id="Dyn_163_166" title="Referenced at line 25; ../../deduplicated.sdf3 line 78">Dyn</a>.<span class="cons_Constructor"><span id="Dyn_167_170" title="Not referenced locally, nor via imports">Dyn</span></span>           = [<span class="cons_String">?</span>]
  <a href="#Type_1238_1242" id="Type_189_193" title="Referenced at line 44; ../modules.sdf3 line 11; ../overlays.sdf3 line 13; ../strategies.sdf3 line 23; ../terms.sdf3 line 9; ../../deduplicated.sdf3 line 73">Type</a>.<span class="cons_Constructor"><a href="#TupleT_811_817" id="TupleT_194_200" title="Referenced at line 30">TupleT</a></span>       = [[<a href="#Type_98_102" id="Type_211_215" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a>] <span class="cons_String">*</span> [{<a href="#Type_98_102" id="Type_221_225" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a> <span class="cons_Lit">" * "</span>}+]]
  <a href="#Type_1238_1242" id="Type_238_242" title="Referenced at line 44; ../modules.sdf3 line 11; ../overlays.sdf3 line 13; ../strategies.sdf3 line 23; ../terms.sdf3 line 9; ../../deduplicated.sdf3 line 73">Type</a>.<span class="cons_Constructor"><span id="DynT_243_247" title="Not referenced locally, nor via imports">DynT</span></span>         = <a href="#Dyn_109_112" id="Dyn_258_261" title="Defined at line 7, 10">Dyn</a>
  <a href="#Type_1238_1242" id="Type_264_268" title="Referenced at line 44; ../modules.sdf3 line 11; ../overlays.sdf3 line 13; ../strategies.sdf3 line 23; ../terms.sdf3 line 9; ../../deduplicated.sdf3 line 73">Type</a>.<span class="cons_Constructor"><span id="StringT_269_276" title="Not referenced locally, nor via imports">StringT</span></span>      = <span class="cons_Lit">"string"</span>
  <a href="#Type_1238_1242" id="Type_295_299" title="Referenced at line 44; ../modules.sdf3 line 11; ../overlays.sdf3 line 13; ../strategies.sdf3 line 23; ../terms.sdf3 line 9; ../../deduplicated.sdf3 line 73">Type</a>.<span class="cons_Constructor"><span id="IntT_300_304" title="Not referenced locally, nor via imports">IntT</span></span>         = <span class="cons_Lit">"int"</span>
  <a href="#Type_1238_1242" id="Type_323_327" title="Referenced at line 44; ../modules.sdf3 line 11; ../overlays.sdf3 line 13; ../strategies.sdf3 line 23; ../terms.sdf3 line 9; ../../deduplicated.sdf3 line 73">Type</a>.<span class="cons_Constructor"><span id="RealT_328_333" title="Not referenced locally, nor via imports">RealT</span></span>        = <span class="cons_Lit">"real"</span>
  <a href="#Type_1238_1242" id="Type_352_356" title="Referenced at line 44; ../modules.sdf3 line 11; ../overlays.sdf3 line 13; ../strategies.sdf3 line 23; ../terms.sdf3 line 9; ../../deduplicated.sdf3 line 73">Type</a>.<span class="cons_Constructor"><span id="BlobT_357_362" title="Not referenced locally, nor via imports">BlobT</span></span>        = <span class="cons_Lit">"blob"</span>
  <a href="#Type_1238_1242" id="Type_381_385" title="Referenced at line 44; ../modules.sdf3 line 11; ../overlays.sdf3 line 13; ../strategies.sdf3 line 23; ../terms.sdf3 line 9; ../../deduplicated.sdf3 line 73">Type</a>              = [<span class="cons_String">(</span>[<a href="#Type_98_102" id="Type_404_408" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a>]<span class="cons_String">)</span>] {<span class="keyword">bracket</span>}
  <a href="#Type_1238_1242" id="Type_424_428" title="Referenced at line 44; ../modules.sdf3 line 11; ../overlays.sdf3 line 13; ../strategies.sdf3 line 23; ../terms.sdf3 line 9; ../../deduplicated.sdf3 line 73">Type</a>              = <a href="#SortT_103_108" id="SortT_444_449" title="Defined at line 7, 19, 20, 21, 22">SortT</a>
  <a href="#SortT_444_449" id="SortT_452_457" title="Referenced at line 18">SortT</a>.<span class="cons_Constructor"><span id="SortT_458_463" title="Not referenced locally, nor via imports">SortT</span></span>       = [[<a href="../../core/identifiers.sdf3#Id_420_422" id="Id_474_476" title="Defined at ../../core/identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>]<span class="cons_String">(</span>[{<a href="#Type_98_102" id="Type_480_484" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>]
  <a href="#SortT_444_449" id="SortT_497_502" title="Referenced at line 18">SortT</a>.<span class="cons_Constructor"><span id="SortTNoArgs_503_514" title="Not referenced locally, nor via imports">SortTNoArgs</span></span> = <a href="../../core/identifiers.sdf3#UCID_432_436" id="UCID_517_521" title="Defined at ../../core/identifiers.sdf3 line 16, 26, 48">UCID</a>
  <a href="#SortT_444_449" id="SortT_524_529" title="Referenced at line 18">SortT</a>             = <span class="cons_Lit">"TP"</span> {<span class="keyword">reject</span>}
  <a href="#SortT_444_449" id="SortT_560_565" title="Referenced at line 18">SortT</a>.<span class="cons_Constructor"><span id="SortTVar_566_574" title="Not referenced locally, nor via imports">SortTVar</span></span>    = <a href="../../core/identifiers.sdf3#SortVar_437_444" id="SortVar_580_587" title="Defined at ../../core/identifiers.sdf3 line 16, 28, 29">SortVar</a>

  <span id="SortArg_591_598" title="Not referenced locally, nor via imports">SortArg</span>.<span class="cons_Constructor"><span id="SATupleT_599_607" title="Not referenced locally, nor via imports">SATupleT</span></span> = [[<a href="../../core/signatures.sdf3#Sort_735_739" id="Sort_612_616" title="Defined at ../../core/signatures.sdf3 line 31, 33, 34, 35">Sort</a>] <span class="cons_String">*</span> [{<a href="../../core/signatures.sdf3#Sort_735_739" id="Sort_622_626" title="Defined at ../../core/signatures.sdf3 line 31, 33, 34, 35">Sort</a> <span class="cons_Lit">" * "</span>}+]]
  <span id="SortArg_639_646" title="Not referenced locally, nor via imports">SortArg</span>.<span class="cons_Constructor"><span id="SADynT_647_653" title="Not referenced locally, nor via imports">SADynT</span></span>   = <a href="#Dyn_109_112" id="Dyn_658_661" title="Defined at line 7, 10">Dyn</a>

<span class="keyword">context-free priorities</span>
  <a href="#Type_98_102" id="Type_689_693" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a>.<span class="cons_Constructor"><a href="#TupleT_194_200" id="TupleT_694_700" title="Defined at line 11">TupleT</a></span> &lt;0&gt; .&gt; <a href="#Type_98_102" id="Type_708_712" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a>.<span class="cons_Constructor"><a href="#TupleT_194_200" id="TupleT_713_719" title="Defined at line 11">TupleT</a></span>,
  {<a href="#Type_98_102" id="Type_724_728" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a> <span class="cons_Lit">"*"</span>}+ = <a href="#Type_98_102" id="Type_737_741" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a> &lt;0&gt; .&gt; <a href="#Type_98_102" id="Type_749_753" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a>.<span class="cons_Constructor"><a href="#TupleT_194_200" id="TupleT_754_760" title="Defined at line 11">TupleT</a></span>,
  {<a href="#Type_98_102" id="Type_765_769" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a> <span class="cons_Lit">"*"</span>}+ = {<a href="#Type_98_102" id="Type_779_783" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a> <span class="cons_Lit">"*"</span>}+ <span class="cons_Lit">"*"</span> <a href="#Type_98_102" id="Type_794_798" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a> &lt;2&gt; .&gt; <a href="#Type_98_102" id="Type_806_810" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a>.<span class="cons_Constructor"><a href="#TupleT_194_200" id="TupleT_811_817" title="Defined at line 11">TupleT</a></span>

<span class="keyword">context-free sorts</span> <a href="#SType_1220_1225" id="SType_838_843" title="Referenced at line 44; ../modules.sdf3 line 11; ../strategies.sdf3 line 27; ../../deduplicated.sdf3 line 80">SType</a> <a href="#SFunType_955_963" id="SFunType_844_852" title="Referenced at line 35; ../internal.sdf3 line 64">SFunType</a> <a href="#SSimpleFunType_1253_1267" id="SSimpleFunType_853_867" title="Referenced at line 44; ../modules.sdf3 line 11; ../../deduplicated.sdf3 line 80">SSimpleFunType</a> <a href="#FunTType_1184_1192" id="FunTType_868_876" title="Referenced at line 42; ../strategies.sdf3 line 44">FunTType</a>
<span class="keyword">context-free syntax</span>
  <a href="#SType_1220_1225" id="SType_899_904" title="Referenced at line 44; ../modules.sdf3 line 11; ../strategies.sdf3 line 27; ../../deduplicated.sdf3 line 80">SType</a>.<span class="cons_Constructor"><span id="SDyn_905_909" title="Not referenced locally, nor via imports">SDyn</span></span>             = [<span class="cons_String">?</span>]
  <a href="#SType_1220_1225" id="SType_930_935" title="Referenced at line 44; ../modules.sdf3 line 11; ../strategies.sdf3 line 27; ../../deduplicated.sdf3 line 80">SType</a>                  = <a href="#SFunType_844_852" id="SFunType_955_963" title="Defined at line 32, 40, 41, 42">SFunType</a>

  <a href="#SSimpleFunType_1253_1267" id="SSimpleFunType_967_981" title="Referenced at line 44; ../modules.sdf3 line 11; ../../deduplicated.sdf3 line 80">SSimpleFunType</a>.<span class="cons_Constructor"><span id="TP_982_984" title="Not referenced locally, nor via imports">TP</span></span>                 = [<span class="cons_String">TP</span>]
  <a href="#SSimpleFunType_1253_1267" id="SSimpleFunType_1010_1024" title="Referenced at line 44; ../modules.sdf3 line 11; ../../deduplicated.sdf3 line 80">SSimpleFunType</a>.<span class="cons_Constructor"><span id="FunNoArgsType_1025_1038" title="Not referenced locally, nor via imports">FunNoArgsType</span></span>      = [[<a href="#Type_98_102" id="Type_1048_1052" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a>] <span class="cons_String">-&gt;</span> [<a href="#Type_98_102" id="Type_1058_1062" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a>]]

  <a href="#SFunType_955_963" id="SFunType_1068_1076" title="Referenced at line 35; ../internal.sdf3 line 64">SFunType</a>          = <a href="#SSimpleFunType_853_867" id="SSimpleFunType_1088_1102" title="Defined at line 32, 37, 38">SSimpleFunType</a>
  <a href="#SFunType_955_963" id="SFunType_1105_1113" title="Referenced at line 35; ../internal.sdf3 line 64">SFunType</a>.<span class="cons_Constructor"><span id="SFunType_1114_1122" title="Not referenced locally, nor via imports">SFunType</span></span> = [<span class="cons_String">(</span>[{<a href="#SType_838_843" id="SType_1129_1134" title="Defined at line 32, 34, 35">SType</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> [<a href="#SSimpleFunType_853_867" id="SSimpleFunType_1145_1159" title="Defined at line 32, 37, 38">SSimpleFunType</a>]]
  <a href="#SFunType_955_963" id="SFunType_1164_1172" title="Referenced at line 35; ../internal.sdf3 line 64">SFunType</a>          = <a href="#FunTType_868_876" id="FunTType_1184_1192" title="Defined at line 32, 44">FunTType</a>

  <a href="#FunTType_1184_1192" id="FunTType_1196_1204" title="Referenced at line 42; ../strategies.sdf3 line 44">FunTType</a>.<span class="cons_Constructor"><span id="FunTType_1205_1213" title="Not referenced locally, nor via imports">FunTType</span></span> = [<span class="cons_String">(</span>[{<a href="#SType_838_843" id="SType_1220_1225" title="Defined at line 32, 34, 35">SType</a> <span class="cons_Lit">", "</span>}*] <span class="cons_String">|</span> [{<a href="#Type_98_102" id="Type_1238_1242" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> [<a href="#SSimpleFunType_853_867" id="SSimpleFunType_1253_1267" title="Defined at line 32, 37, 38">SSimpleFunType</a>]]

</code></pre></td></tr></tbody></table></div>