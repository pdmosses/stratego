---
title: signatures.sdf3
---

# `signatures.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/core/signatures.sdf3]

[pdmosses/stratego/stratego.lang/syntax/core/signatures.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/core/signatures.sdf3 "The source file on GitHub"

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
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sugar/signatures.sdf3#core/signatures_35_50" id="core/signatures_7_22" title="Referenced at ../../sugar/signatures.sdf3 line 4">core/signatures</a>

<span class="keyword">imports</span>
  <a href="../identifiers.sdf3#core/identifiers_7_23" id="core/identifiers_34_50" title="Defined at ../identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../constants.sdf3#core/constants_7_21" id="core/constants_53_67" title="Defined at ../constants.sdf3 line 1">core/constants</a>

<span class="keyword">context-free sorts</span> <a href="#Kind_561_565" id="Kind_88_92" title="Referenced at line 18; ../../deduplicated.sdf3 line 31">Kind</a>
<span class="keyword">context-free syntax</span>
  <a href="#Kind_561_565" id="Kind_115_119" title="Referenced at line 18; ../../deduplicated.sdf3 line 31">Kind</a>.<span class="cons_Constructor"><span id="Star_120_124" title="Not referenced locally, nor via imports">Star</span></span> = &lt;<span class="cons_String">*</span>&gt;

<span class="keyword">context-free sorts</span> <a href="#SortDef_647_654" id="SortDef_151_158" title="Referenced at line 24">SortDef</a>
<span class="keyword">context-free syntax</span>
  <a href="#SortDef_647_654" id="SortDef_181_188" title="Referenced at line 24">SortDef</a>.<span class="cons_Constructor"><span id="SortDefVar_189_199" title="Not referenced locally, nor via imports">SortDefVar</span></span>    = <a href="../identifiers.sdf3#LCID_427_431" id="LCID_205_209" title="Defined at ../identifiers.sdf3 line 16, 25, 47">LCID</a> {<span class="keyword">deprecated</span>("This syntax never had a clear meaning should not be used")}
  <a href="#SortDef_647_654" id="SortDef_285_292" title="Referenced at line 24">SortDef</a>.<span class="cons_Constructor"><span id="SortDefNoArgs_293_306" title="Not referenced locally, nor via imports">SortDefNoArgs</span></span> = <a href="../identifiers.sdf3#UCID_432_436" id="UCID_309_313" title="Defined at ../identifiers.sdf3 line 16, 26, 48">UCID</a>
  <a href="#SortDef_647_654" id="SortDef_316_323" title="Referenced at line 24">SortDef</a>.<span class="cons_Constructor"><span id="SortDef_324_331" title="Not referenced locally, nor via imports">SortDef</span></span> = [[<a href="../identifiers.sdf3#UCID_432_436" id="UCID_336_340" title="Defined at ../identifiers.sdf3 line 16, 26, 48">UCID</a>]<span class="cons_String">(</span>[{<a href="#Kind_88_92" id="Kind_344_348" title="Defined at line 7, 9">Kind</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>]
  <a href="#SortDef_647_654" id="SortDef_361_368" title="Referenced at line 24">SortDef</a>.<span class="cons_Constructor"><span id="SortDefDepr_369_380" title="Not referenced locally, nor via imports">SortDefDepr</span></span> = &lt;&lt;<a href="../identifiers.sdf3#Id_420_422" id="Id_385_387" title="Defined at ../identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Sort_735_739" id="Sort_391_395" title="Defined at line 31, 33, 34, 35">Sort</a> <span class="cons_Lit">", "</span>}+&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">deprecated</span>("This syntax never had a clear meaning should be replaced by the version that uses kinds A(*, *)")}

  <a href="#SortDef_647_654" id="SortDef_521_528" title="Referenced at line 24">SortDef</a>.<span class="cons_Constructor"><span id="ExtSortDef_529_539" title="Not referenced locally, nor via imports">ExtSortDef</span></span> = [<span class="cons_String">external</span> [<a href="../identifiers.sdf3#UCID_432_436" id="UCID_553_557" title="Defined at ../identifiers.sdf3 line 16, 26, 48">UCID</a>]<span class="cons_String">(</span>[{<a href="#Kind_88_92" id="Kind_561_565" title="Defined at line 7, 9">Kind</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>]

<span class="keyword">context-free sorts</span> <a href="../modules.sdf3#Sdecl_460_465" id="Sdecl_596_601" title="Referenced at ../modules.sdf3 line 36">Sdecl</a>
<span class="keyword">context-free syntax</span>

  <a href="../modules.sdf3#Sdecl_460_465" id="Sdecl_625_630" title="Referenced at ../modules.sdf3 line 36">Sdecl</a>.<span class="cons_Constructor"><span id="Sorts_631_636" title="Not referenced locally, nor via imports">Sorts</span></span> =
&lt;<span class="cons_String">sorts</span> &lt;<a href="#SortDef_151_158" id="SortDef_647_654" title="Defined at line 11, 13, 14, 15, 16, 18">SortDef</a>*&gt;&gt;

  <a href="../modules.sdf3#Sdecl_460_465" id="Sdecl_661_666" title="Referenced at ../modules.sdf3 line 36">Sdecl</a>.<span class="cons_Constructor"><span id="Constructors_667_679" title="Not referenced locally, nor via imports">Constructors</span></span> =
&lt;<span class="cons_String">constructors</span>

&lt;{<a href="#Opdecl_901_907" id="Opdecl_699_705" title="Defined at line 38, 40, 41, 42, 44, 45, 46">Opdecl</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;

<span class="keyword">context-free sorts</span> <a href="#Sort_1716_1720" id="Sort_735_739" title="Referenced at line 67; ../../deduplicated.sdf3 line 77; ../../gradual-types/signatures.sdf3 line 24">Sort</a> <a href="#SortArg_846_853" id="SortArg_740_747" title="Referenced at line 35">SortArg</a>
<span class="keyword">context-free syntax</span>
  <a href="#Sort_1716_1720" id="Sort_770_774" title="Referenced at line 67; ../../deduplicated.sdf3 line 77; ../../gradual-types/signatures.sdf3 line 24">Sort</a>.<span class="cons_Constructor"><span id="SortVar_775_782" title="Not referenced locally, nor via imports">SortVar</span></span>    = <a href="../identifiers.sdf3#LCID_427_431" id="LCID_788_792" title="Defined at ../identifiers.sdf3 line 16, 25, 47">LCID</a>
  <a href="#Sort_1716_1720" id="Sort_795_799" title="Referenced at line 67; ../../deduplicated.sdf3 line 77; ../../gradual-types/signatures.sdf3 line 24">Sort</a>.<span class="cons_Constructor"><span id="SortNoArgs_800_810" title="Not referenced locally, nor via imports">SortNoArgs</span></span> = <a href="../identifiers.sdf3#UCID_432_436" id="UCID_813_817" title="Defined at ../identifiers.sdf3 line 16, 26, 48">UCID</a>
  <a href="#Sort_1716_1720" id="Sort_820_824" title="Referenced at line 67; ../../deduplicated.sdf3 line 77; ../../gradual-types/signatures.sdf3 line 24">Sort</a>.<span class="cons_Constructor"><span id="Sort_825_829" title="Not referenced locally, nor via imports">Sort</span></span>       = &lt;&lt;<a href="../identifiers.sdf3#Id_420_422" id="Id_840_842" title="Defined at ../identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#SortArg_740_747" id="SortArg_846_853" title="Defined at line 31, 36">SortArg</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;
  <a href="#SortArg_846_853" id="SortArg_866_873" title="Referenced at line 35">SortArg</a> = <a href="#Sort_735_739" id="Sort_876_880" title="Defined at line 31, 33, 34, 35">Sort</a>

<span class="keyword">context-free sorts</span> <a href="#Opdecl_699_705" id="Opdecl_901_907" title="Referenced at line 29">Opdecl</a>
<span class="keyword">context-free syntax</span>
  <a href="#Opdecl_699_705" id="Opdecl_930_936" title="Referenced at line 29">Opdecl</a>.<span class="cons_Constructor"><span id="OpDecl_937_943" title="Not referenced locally, nor via imports">OpDecl</span></span>    = &lt;&lt;<a href="../identifiers.sdf3#Id_420_422" id="Id_951_953" title="Defined at ../identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>&gt; <span class="cons_String">:</span> &lt;<a href="#OpType_1262_1268" id="OpType_958_964" title="Defined at line 48, 62, 63">OpType</a>&gt;&gt;
  <a href="#Opdecl_699_705" id="Opdecl_969_975" title="Referenced at line 29">Opdecl</a>.<span class="cons_Constructor"><span id="OpDeclQ_976_983" title="Not referenced locally, nor via imports">OpDeclQ</span></span>   = &lt;&lt;<a href="../constants.sdf3#String_46_52" id="String_990_996" title="Defined at ../constants.sdf3 line 3, 9">String</a>&gt; <span class="cons_String">:</span> &lt;<a href="#OpType_1262_1268" id="OpType_1001_1007" title="Defined at line 48, 62, 63">OpType</a>&gt;&gt;
  <a href="#Opdecl_699_705" id="Opdecl_1012_1018" title="Referenced at line 29">Opdecl</a>.<span class="cons_Constructor"><span id="OpDeclInj_1019_1028" title="Not referenced locally, nor via imports">OpDeclInj</span></span> = &lt;<span class="cons_String">:</span> &lt;<a href="#OpType_1262_1268" id="OpType_1035_1041" title="Defined at line 48, 62, 63">OpType</a>&gt;&gt;

  <a href="#Opdecl_699_705" id="Opdecl_1047_1053" title="Referenced at line 29">Opdecl</a>.<span class="cons_Constructor"><span id="ExtOpDecl_1054_1063" title="Not referenced locally, nor via imports">ExtOpDecl</span></span>    = &lt;<span class="cons_String">external</span> &lt;<a href="../identifiers.sdf3#Id_420_422" id="Id_1080_1082" title="Defined at ../identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>&gt; <span class="cons_String">:</span> &lt;<a href="#OpType_1262_1268" id="OpType_1087_1093" title="Defined at line 48, 62, 63">OpType</a>&gt;&gt;
  <a href="#Opdecl_699_705" id="Opdecl_1098_1104" title="Referenced at line 29">Opdecl</a>.<span class="cons_Constructor"><span id="ExtOpDeclQ_1105_1115" title="Not referenced locally, nor via imports">ExtOpDeclQ</span></span>   = &lt;<span class="cons_String">external</span> &lt;<a href="../constants.sdf3#String_46_52" id="String_1131_1137" title="Defined at ../constants.sdf3 line 3, 9">String</a>&gt; <span class="cons_String">:</span> &lt;<a href="#OpType_1262_1268" id="OpType_1142_1148" title="Defined at line 48, 62, 63">OpType</a>&gt;&gt;
  <a href="#Opdecl_699_705" id="Opdecl_1153_1159" title="Referenced at line 29">Opdecl</a>.<span class="cons_Constructor"><span id="ExtOpDeclInj_1160_1172" title="Not referenced locally, nor via imports">ExtOpDeclInj</span></span> = &lt;<span class="cons_String">external</span> <span class="cons_String">:</span> &lt;<a href="#OpType_1262_1268" id="OpType_1188_1194" title="Defined at line 48, 62, 63">OpType</a>&gt;&gt;

<span class="keyword">context-free sorts</span> <a href="#OldType_1453_1460" id="OldType_1217_1224" title="Referenced at line 56; ../strategies.sdf3 line 50">OldType</a> <a href="#OldArgType_1342_1352" id="OldArgType_1225_1235" title="Referenced at line 52">OldArgType</a> <a href="#ConstType_1602_1611" id="ConstType_1236_1245" title="Referenced at line 63; ../../gradual-types/overlays.sdf3 line 13">ConstType</a> <a href="#FunType_1503_1510" id="FunType_1246_1253" title="Referenced at line 59">FunType</a> <a href="#RetType_1366_1373" id="RetType_1254_1261" title="Referenced at line 52">RetType</a> <a href="#OpType_1188_1194" id="OpType_1262_1268" title="Referenced at line 46">OpType</a>
<span class="keyword">context-free syntax</span>
  <a href="#ConstType_1602_1611" id="ConstType_1291_1300" title="Referenced at line 63; ../../gradual-types/overlays.sdf3 line 13">ConstType</a>.<span class="cons_Constructor"><span id="ConstType_1301_1310" title="Not referenced locally, nor via imports">ConstType</span></span> = <a href="#Sort_735_739" id="Sort_1313_1317" title="Defined at line 31, 33, 34, 35">Sort</a>

  <a href="#FunType_1503_1510" id="FunType_1321_1328" title="Referenced at line 59">FunType</a>.<span class="cons_Constructor"><span id="FunType_1329_1336" title="Not referenced locally, nor via imports">FunType</span></span> = [[{<a href="#OldArgType_1225_1235" id="OldArgType_1342_1352" title="Defined at line 48, 54, 55">OldArgType</a> <span class="cons_Lit">" * "</span>}+] <span class="cons_String">-&gt;</span> [<a href="#RetType_1254_1261" id="RetType_1366_1373" title="Defined at line 48, 56, 57">RetType</a>]]

  <a href="#OldArgType_1342_1352" id="OldArgType_1379_1389" title="Referenced at line 52">OldArgType</a> = &lt;<span class="cons_String">(</span>&lt;<a href="#OldType_1217_1224" id="OldType_1395_1402" title="Defined at line 48, 59, 60">OldType</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}
  <a href="#OldArgType_1342_1352" id="OldArgType_1418_1428" title="Referenced at line 52">OldArgType</a> = <a href="#ConstType_1236_1245" id="ConstType_1431_1440" title="Defined at line 48, 50">ConstType</a>
  <a href="#RetType_1366_1373" id="RetType_1443_1450" title="Referenced at line 52">RetType</a> = <a href="#OldType_1217_1224" id="OldType_1453_1460" title="Defined at line 48, 59, 60">OldType</a>
  <a href="#RetType_1366_1373" id="RetType_1463_1470" title="Referenced at line 52">RetType</a> = <a href="#FunType_1246_1253" id="FunType_1473_1480" title="Defined at line 48, 52">FunType</a> {<span class="keyword">reject</span>}

  <a href="#OldType_1453_1460" id="OldType_1493_1500" title="Referenced at line 56; ../strategies.sdf3 line 50">OldType</a> = <a href="#FunType_1246_1253" id="FunType_1503_1510" title="Defined at line 48, 52">FunType</a>
  <a href="#OldType_1453_1460" id="OldType_1513_1520" title="Referenced at line 56; ../strategies.sdf3 line 50">OldType</a> = <a href="#ConstType_1236_1245" id="ConstType_1523_1532" title="Defined at line 48, 50">ConstType</a>

  <a href="#OpType_1188_1194" id="OpType_1536_1542" title="Referenced at line 46">OpType</a> = <a href="#ConstType_1236_1245" id="ConstType_1545_1554" title="Defined at line 48, 50">ConstType</a>
  <a href="#OpType_1188_1194" id="OpType_1557_1563" title="Referenced at line 46">OpType</a>.<span class="cons_Constructor"><span id="OpFunType_1564_1573" title="Not referenced locally, nor via imports">OpFunType</span></span> = [[{<a href="#ConstType_1236_1245" id="ConstType_1579_1588" title="Defined at line 48, 50">ConstType</a> <span class="cons_Lit">" * "</span>}+] <span class="cons_String">-&gt;</span> [<a href="#ConstType_1236_1245" id="ConstType_1602_1611" title="Defined at line 48, 50">ConstType</a>]]

<span class="layout">// Restriction is required for the Sort* in Sdecl: List(a) is ambiguous.</span>
<span class="keyword">context-free restrictions</span>
  <a href="#Sort_735_739" id="Sort_1716_1720" title="Defined at line 31, 33, 34, 35">Sort</a> -/- [\(]

</code></pre></td></tr></tbody></table></div>