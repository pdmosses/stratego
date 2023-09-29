---
title: signatures-namespaced.sdf3
---

# `signatures-namespaced.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/gradual-types/signatures-namespaced.sdf3]

[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/gradual-types/signatures-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/gradual-types/signatures-namespaced.sdf3 "The source file on GitHub"

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
45
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../terms-namespaced.sdf3#StrategoLang/gradual-types/signatures-namespaced_139_187" id="StrategoLang/gradual-types/signatures-namespaced_7_55" title="Referenced at ../terms-namespaced.sdf3 line 6">StrategoLang/gradual-types/signatures-namespaced</a>

<span class="keyword">imports</span>
  <a href="../../core/identifiers-namespaced.sdf3#StrategoLang/core/identifiers-namespaced_7_47" id="StrategoLang/core/identifiers-namespaced_67_107" title="Defined at ../../core/identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>        
  <a href="../../core/signatures-namespaced.sdf3#StrategoLang/core/signatures-namespaced_7_46" id="StrategoLang/core/signatures-namespaced_111_150" title="Defined at ../../core/signatures-namespaced.sdf3 line 1">StrategoLang/core/signatures-namespaced</a>

<span class="keyword">sorts</span> <a href="#StrategoLang-Type_2003_2020" id="StrategoLang-Type_158_175" title="Referenced at line 45; ../strategies-namespaced.sdf3 line 22; ../terms-namespaced.sdf3 line 10">StrategoLang-Type</a> <a href="#StrategoLang-SortT_695_713" id="StrategoLang-SortT_176_194" title="Referenced at line 20">StrategoLang-SortT</a> <a href="#StrategoLang-Dyn_1074_1090" id="StrategoLang-Dyn_195_211" title="Referenced at line 26">StrategoLang-Dyn</a>

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-ConstType_236_258" title="Not referenced locally, nor via imports">StrategoLang-ConstType</span>.<span class="cons_Constructor"><span id="ConstDynT_259_268" title="Not referenced locally, nor via imports">ConstDynT</span></span> = <a href="#StrategoLang-Dyn_195_211" id="StrategoLang-Dyn_271_287" title="Defined at line 7, 12">StrategoLang-Dyn</a> { }
  <a href="#StrategoLang-Dyn_1074_1090" id="StrategoLang-Dyn_294_310" title="Referenced at line 26">StrategoLang-Dyn</a>.<span class="cons_Constructor"><span id="Dyn_311_314" title="Not referenced locally, nor via imports">Dyn</span></span> = [<span class="cons_String">?</span>] { }
  <a href="#StrategoLang-Type_2003_2020" id="StrategoLang-Type_327_344" title="Referenced at line 45; ../strategies-namespaced.sdf3 line 22; ../terms-namespaced.sdf3 line 10">StrategoLang-Type</a>.<span class="cons_Constructor"><a href="#TupleT_1370_1376" id="TupleT_345_351" title="Referenced at line 32">TupleT</a></span> = [[<a href="#StrategoLang-Type_158_175" id="StrategoLang-Type_356_373" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a>] <span class="cons_String">*</span> [{<a href="#StrategoLang-Type_158_175" id="StrategoLang-Type_379_396" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a> <span class="cons_Lit">" * "</span>}+]] { }
  <a href="#StrategoLang-Type_2003_2020" id="StrategoLang-Type_413_430" title="Referenced at line 45; ../strategies-namespaced.sdf3 line 22; ../terms-namespaced.sdf3 line 10">StrategoLang-Type</a>.<span class="cons_Constructor"><span id="DynT_431_435" title="Not referenced locally, nor via imports">DynT</span></span> = <a href="#StrategoLang-Dyn_195_211" id="StrategoLang-Dyn_438_454" title="Defined at line 7, 12">StrategoLang-Dyn</a> { }
  <a href="#StrategoLang-Type_2003_2020" id="StrategoLang-Type_461_478" title="Referenced at line 45; ../strategies-namespaced.sdf3 line 22; ../terms-namespaced.sdf3 line 10">StrategoLang-Type</a>.<span class="cons_Constructor"><span id="StringT_479_486" title="Not referenced locally, nor via imports">StringT</span></span> = <span class="cons_Lit">"string"</span> { }
  <a href="#StrategoLang-Type_2003_2020" id="StrategoLang-Type_504_521" title="Referenced at line 45; ../strategies-namespaced.sdf3 line 22; ../terms-namespaced.sdf3 line 10">StrategoLang-Type</a>.<span class="cons_Constructor"><span id="IntT_522_526" title="Not referenced locally, nor via imports">IntT</span></span> = <span class="cons_Lit">"int"</span> { }
  <a href="#StrategoLang-Type_2003_2020" id="StrategoLang-Type_541_558" title="Referenced at line 45; ../strategies-namespaced.sdf3 line 22; ../terms-namespaced.sdf3 line 10">StrategoLang-Type</a>.<span class="cons_Constructor"><span id="RealT_559_564" title="Not referenced locally, nor via imports">RealT</span></span> = <span class="cons_Lit">"real"</span> { }
  <a href="#StrategoLang-Type_2003_2020" id="StrategoLang-Type_580_597" title="Referenced at line 45; ../strategies-namespaced.sdf3 line 22; ../terms-namespaced.sdf3 line 10">StrategoLang-Type</a>.<span class="cons_Constructor"><span id="BlobT_598_603" title="Not referenced locally, nor via imports">BlobT</span></span> = <span class="cons_Lit">"blob"</span> { }
  <a href="#StrategoLang-Type_2003_2020" id="StrategoLang-Type_619_636" title="Referenced at line 45; ../strategies-namespaced.sdf3 line 22; ../terms-namespaced.sdf3 line 10">StrategoLang-Type</a> = [<span class="cons_String">(</span>[<a href="#StrategoLang-Type_158_175" id="StrategoLang-Type_642_659" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a>]<span class="cons_String">)</span>] {<span class="keyword">bracket</span>}
  <a href="#StrategoLang-Type_2003_2020" id="StrategoLang-Type_675_692" title="Referenced at line 45; ../strategies-namespaced.sdf3 line 22; ../terms-namespaced.sdf3 line 10">StrategoLang-Type</a> = <a href="#StrategoLang-SortT_176_194" id="StrategoLang-SortT_695_713" title="Defined at line 7, 21, 22, 23, 24">StrategoLang-SortT</a> { }
  <a href="#StrategoLang-SortT_695_713" id="StrategoLang-SortT_720_738" title="Referenced at line 20">StrategoLang-SortT</a>.<span class="cons_Constructor"><span id="SortT_739_744" title="Not referenced locally, nor via imports">SortT</span></span> = [[<a href="../../core/identifiers-namespaced.sdf3#StrategoLang-Id_645_660" id="StrategoLang-Id_749_764" title="Defined at ../../core/identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a>]<span class="cons_String">(</span>[{<a href="#StrategoLang-Type_158_175" id="StrategoLang-Type_768_785" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>] { }
  <a href="#StrategoLang-SortT_695_713" id="StrategoLang-SortT_802_820" title="Referenced at line 20">StrategoLang-SortT</a>.<span class="cons_Constructor"><span id="SortTNoArgs_821_832" title="Not referenced locally, nor via imports">SortTNoArgs</span></span> = <a href="../../core/identifiers-namespaced.sdf3#StrategoLang-UCID_841_858" id="StrategoLang-UCID_835_852" title="Defined at ../../core/identifiers-namespaced.sdf3 line 31, 54">StrategoLang-UCID</a> { }
  <a href="#StrategoLang-SortT_695_713" id="StrategoLang-SortT_859_877" title="Referenced at line 20">StrategoLang-SortT</a> = <span class="cons_Lit">"TP"</span> {<span class="keyword">reject</span>}
  <a href="#StrategoLang-SortT_695_713" id="StrategoLang-SortT_896_914" title="Referenced at line 20">StrategoLang-SortT</a>.<span class="cons_Constructor"><span id="SortTVar_915_923" title="Not referenced locally, nor via imports">SortTVar</span></span> = <a href="../../core/identifiers-namespaced.sdf3#StrategoLang-SortVar_892_912" id="StrategoLang-SortVar_926_946" title="Defined at ../../core/identifiers-namespaced.sdf3 line 32, 33">StrategoLang-SortVar</a> { }
  <span id="StrategoLang-SortArg_953_973" title="Not referenced locally, nor via imports">StrategoLang-SortArg</span>.<span class="cons_Constructor"><span id="SATupleT_974_982" title="Not referenced locally, nor via imports">SATupleT</span></span> = [[<a href="../../core/signatures-namespaced.sdf3#StrategoLang-Sort_1053_1070" id="StrategoLang-Sort_987_1004" title="Defined at ../../core/signatures-namespaced.sdf3 line 32, 36, 37, 38">StrategoLang-Sort</a>] <span class="cons_String">*</span> [{<a href="../../core/signatures-namespaced.sdf3#StrategoLang-Sort_1053_1070" id="StrategoLang-Sort_1010_1027" title="Defined at ../../core/signatures-namespaced.sdf3 line 32, 36, 37, 38">StrategoLang-Sort</a> <span class="cons_Lit">" * "</span>}+]] { }
  <span id="StrategoLang-SortArg_1044_1064" title="Not referenced locally, nor via imports">StrategoLang-SortArg</span>.<span class="cons_Constructor"><span id="SADynT_1065_1071" title="Not referenced locally, nor via imports">SADynT</span></span> = <a href="#StrategoLang-Dyn_195_211" id="StrategoLang-Dyn_1074_1090" title="Defined at line 7, 12">StrategoLang-Dyn</a> { }

<span class="keyword">context-free priorities</span>

  <a href="#StrategoLang-Type_158_175" id="StrategoLang-Type_1123_1140" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a>.<span class="cons_Constructor"><a href="#TupleT_345_351" id="TupleT_1141_1147" title="Defined at line 13">TupleT</a></span> &lt;0&gt;. &gt; <a href="#StrategoLang-Type_158_175" id="StrategoLang-Type_1155_1172" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a>.<span class="cons_Constructor"><a href="#TupleT_345_351" id="TupleT_1173_1179" title="Defined at line 13">TupleT</a></span>,
  {<a href="#StrategoLang-Type_158_175" id="StrategoLang-Type_1184_1201" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a> <span class="cons_Lit">"*"</span>}+ = <a href="#StrategoLang-Type_158_175" id="StrategoLang-Type_1210_1227" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a> { } &lt;0&gt;. &gt; <a href="#StrategoLang-Type_158_175" id="StrategoLang-Type_1239_1256" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a>.<span class="cons_Constructor"><a href="#TupleT_345_351" id="TupleT_1257_1263" title="Defined at line 13">TupleT</a></span>,
  {<a href="#StrategoLang-Type_158_175" id="StrategoLang-Type_1268_1285" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a> <span class="cons_Lit">"*"</span>}+ = {<a href="#StrategoLang-Type_158_175" id="StrategoLang-Type_1295_1312" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a> <span class="cons_Lit">"*"</span>}+ <span class="cons_Lit">"*"</span> <a href="#StrategoLang-Type_158_175" id="StrategoLang-Type_1323_1340" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a> { } &lt;2&gt;. &gt; <a href="#StrategoLang-Type_158_175" id="StrategoLang-Type_1352_1369" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a>.<span class="cons_Constructor"><a href="#TupleT_345_351" id="TupleT_1370_1376" title="Defined at line 13">TupleT</a></span>

<span class="keyword">sorts</span> <a href="#StrategoLang-SType_1972_1990" id="StrategoLang-SType_1384_1402" title="Referenced at line 45; ../strategies-namespaced.sdf3 line 25">StrategoLang-SType</a> <a href="#StrategoLang-SFunType_1556_1577" id="StrategoLang-SFunType_1403_1424" title="Referenced at line 39">StrategoLang-SFunType</a> <a href="#StrategoLang-SSimpleFunType_2031_2058" id="StrategoLang-SSimpleFunType_1425_1452" title="Referenced at line 45">StrategoLang-SSimpleFunType</a> <a href="#StrategoLang-FunTType_1907_1928" id="StrategoLang-FunTType_1453_1474" title="Referenced at line 44; ../strategies-namespaced.sdf3 line 36">StrategoLang-FunTType</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-SType_1972_1990" id="StrategoLang-SType_1499_1517" title="Referenced at line 45; ../strategies-namespaced.sdf3 line 25">StrategoLang-SType</a>.<span class="cons_Constructor"><span id="SDyn_1518_1522" title="Not referenced locally, nor via imports">SDyn</span></span> = [<span class="cons_String">?</span>] { }
  <a href="#StrategoLang-SType_1972_1990" id="StrategoLang-SType_1535_1553" title="Referenced at line 45; ../strategies-namespaced.sdf3 line 25">StrategoLang-SType</a> = <a href="#StrategoLang-SFunType_1403_1424" id="StrategoLang-SFunType_1556_1577" title="Defined at line 34, 42, 43, 44">StrategoLang-SFunType</a> { }
  <a href="#StrategoLang-SSimpleFunType_2031_2058" id="StrategoLang-SSimpleFunType_1584_1611" title="Referenced at line 45">StrategoLang-SSimpleFunType</a>.<span class="cons_Constructor"><span id="TP_1612_1614" title="Not referenced locally, nor via imports">TP</span></span> = [<span class="cons_String">TP</span>] { }
  <a href="#StrategoLang-SSimpleFunType_2031_2058" id="StrategoLang-SSimpleFunType_1628_1655" title="Referenced at line 45">StrategoLang-SSimpleFunType</a>.<span class="cons_Constructor"><span id="FunNoArgsType_1656_1669" title="Not referenced locally, nor via imports">FunNoArgsType</span></span> = [[<a href="#StrategoLang-Type_158_175" id="StrategoLang-Type_1674_1691" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a>] <span class="cons_String">-&gt;</span> [<a href="#StrategoLang-Type_158_175" id="StrategoLang-Type_1697_1714" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a>]] { }
  <a href="#StrategoLang-SFunType_1556_1577" id="StrategoLang-SFunType_1723_1744" title="Referenced at line 39">StrategoLang-SFunType</a> = <a href="#StrategoLang-SSimpleFunType_1425_1452" id="StrategoLang-SSimpleFunType_1747_1774" title="Defined at line 34, 40, 41">StrategoLang-SSimpleFunType</a> { }
  <a href="#StrategoLang-SFunType_1556_1577" id="StrategoLang-SFunType_1781_1802" title="Referenced at line 39">StrategoLang-SFunType</a>.<span class="cons_Constructor"><span id="SFunType_1803_1811" title="Not referenced locally, nor via imports">SFunType</span></span> = [<span class="cons_String">(</span>[{<a href="#StrategoLang-SType_1384_1402" id="StrategoLang-SType_1818_1836" title="Defined at line 34, 38, 39">StrategoLang-SType</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> [<a href="#StrategoLang-SSimpleFunType_1425_1452" id="StrategoLang-SSimpleFunType_1847_1874" title="Defined at line 34, 40, 41">StrategoLang-SSimpleFunType</a>]] { }
  <a href="#StrategoLang-SFunType_1556_1577" id="StrategoLang-SFunType_1883_1904" title="Referenced at line 39">StrategoLang-SFunType</a> = <a href="#StrategoLang-FunTType_1453_1474" id="StrategoLang-FunTType_1907_1928" title="Defined at line 34, 45">StrategoLang-FunTType</a> { }
  <a href="#StrategoLang-FunTType_1907_1928" id="StrategoLang-FunTType_1935_1956" title="Referenced at line 44; ../strategies-namespaced.sdf3 line 36">StrategoLang-FunTType</a>.<span class="cons_Constructor"><span id="FunTType_1957_1965" title="Not referenced locally, nor via imports">FunTType</span></span> = [<span class="cons_String">(</span>[{<a href="#StrategoLang-SType_1384_1402" id="StrategoLang-SType_1972_1990" title="Defined at line 34, 38, 39">StrategoLang-SType</a> <span class="cons_Lit">", "</span>}*] <span class="cons_String">|</span> [{<a href="#StrategoLang-Type_158_175" id="StrategoLang-Type_2003_2020" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> [<a href="#StrategoLang-SSimpleFunType_1425_1452" id="StrategoLang-SSimpleFunType_2031_2058" title="Defined at line 34, 40, 41">StrategoLang-SSimpleFunType</a>]] { }

</code></pre></td></tr></tbody></table></div>