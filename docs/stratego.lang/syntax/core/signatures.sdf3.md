---
title: signatures.sdf3
hide:
  - toc
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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="core/signatures_1_8" title="Multi-file references" data-urls="../main.sdf3/#core/signatures_7_3 line 7; ../modules.sdf3/#core/signatures_6_3 line 6; ../strategies.sdf3/#core/signatures_6_3 line 6; ../../deduplicated.sdf3/#core/signatures_5_3 line 5; ../../gradual-types/overlays.sdf3/#core/signatures_4_3 line 4; ../../gradual-types/signatures.sdf3/#core/signatures_5_3 line 5; ../../sugar/dynamic-rules.sdf3/#core/signatures_6_3 line 6; ../../sugar/rules.sdf3/#core/signatures_5_5 line 5; ../../sugar/signatures.sdf3/#core/signatures_4_3 line 4">core/signatures</button>

<span class="keyword">imports</span>
  <a href="../identifiers.sdf3/#core/identifiers_1_8" id="core/identifiers_4_3" title="Defined at ../identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../constants.sdf3/#core/constants_1_8" id="core/constants_5_3" title="Defined at ../constants.sdf3 line 1">core/constants</a>

<span class="keyword">context-free sorts</span> <button class="modal-open" id="Kind_7_20" title="Multi-file references" data-urls="#Kind_15_31 line 15, 18; ../../deduplicated.sdf3/#Kind_28_28 line 28, 31">Kind</button>
<span class="keyword">context-free syntax</span>
  <button class="modal-open" id="Kind_9_3" title="Multi-file references" data-urls="#Kind_15_31 line 15, 18; ../../deduplicated.sdf3/#Kind_28_28 line 28, 31">Kind</button>.<span class="cons_Constructor"><span id="Star_9_8" title="Not referenced">Star</span></span> = &lt;<span class="cons_String">*</span>&gt;

<span class="keyword">context-free sorts</span> <a href="#SortDef_24_9" id="SortDef_11_20" title="Referenced at line 24">SortDef</a>
<span class="keyword">context-free syntax</span>
  <a href="#SortDef_24_9" id="SortDef_13_3" title="Referenced at line 24">SortDef</a>.<span class="cons_Constructor"><span id="SortDefVar_13_11" title="Not referenced">SortDefVar</span></span>    = <a href="../identifiers.sdf3/#LCID_16_22" id="LCID_13_27" title="Defined at ../identifiers.sdf3 line 16, 25, 47">LCID</a> {<span class="keyword">deprecated</span>("This syntax never had a clear meaning should not be used")}
  <a href="#SortDef_24_9" id="SortDef_14_3" title="Referenced at line 24">SortDef</a>.<span class="cons_Constructor"><span id="SortDefNoArgs_14_11" title="Not referenced">SortDefNoArgs</span></span> = <a href="../identifiers.sdf3/#UCID_16_27" id="UCID_14_27" title="Defined at ../identifiers.sdf3 line 16, 26, 48">UCID</a>
  <a href="#SortDef_24_9" id="SortDef_15_3" title="Referenced at line 24">SortDef</a>.<span class="cons_Constructor"><span id="SortDef_15_11" title="Not referenced">SortDef</span></span> = [[<a href="../identifiers.sdf3/#UCID_16_27" id="UCID_15_23" title="Defined at ../identifiers.sdf3 line 16, 26, 48">UCID</a>]<span class="cons_String">(</span>[{<a href="#Kind_7_20" id="Kind_15_31" title="Defined at line 7, 9">Kind</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>]
  <a href="#SortDef_24_9" id="SortDef_16_3" title="Referenced at line 24">SortDef</a>.<span class="cons_Constructor"><span id="SortDefDepr_16_11" title="Not referenced">SortDefDepr</span></span> = &lt;&lt;<a href="../identifiers.sdf3/#Id_16_15" id="Id_16_27" title="Defined at ../identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Sort_31_20" id="Sort_16_33" title="Defined at line 31, 33, 34, 35">Sort</a> <span class="cons_Lit">", "</span>}+&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">deprecated</span>("This syntax never had a clear meaning should be replaced by the version that uses kinds A(*, *)")}

  <a href="#SortDef_24_9" id="SortDef_18_3" title="Referenced at line 24">SortDef</a>.<span class="cons_Constructor"><span id="ExtSortDef_18_11" title="Not referenced">ExtSortDef</span></span> = [<span class="cons_String">external</span> [<a href="../identifiers.sdf3/#UCID_16_27" id="UCID_18_35" title="Defined at ../identifiers.sdf3 line 16, 26, 48">UCID</a>]<span class="cons_String">(</span>[{<a href="#Kind_7_20" id="Kind_18_43" title="Defined at line 7, 9">Kind</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>]

<span class="keyword">context-free sorts</span> <a href="../modules.sdf3/#Sdecl_36_3" id="Sdecl_20_20" title="Referenced at ../modules.sdf3 line 36">Sdecl</a>
<span class="keyword">context-free syntax</span>

  <a href="../modules.sdf3/#Sdecl_36_3" id="Sdecl_23_3" title="Referenced at ../modules.sdf3 line 36">Sdecl</a>.<span class="cons_Constructor"><span id="Sorts_23_9" title="Not referenced">Sorts</span></span> =
&lt;<span class="cons_String">sorts</span> &lt;<a href="#SortDef_11_20" id="SortDef_24_9" title="Defined at line 11, 13, 14, 15, 16, 18">SortDef</a>*&gt;&gt;

  <a href="../modules.sdf3/#Sdecl_36_3" id="Sdecl_26_3" title="Referenced at ../modules.sdf3 line 36">Sdecl</a>.<span class="cons_Constructor"><span id="Constructors_26_9" title="Not referenced">Constructors</span></span> =
&lt;<span class="cons_String">constructors</span>

&lt;{<a href="#Opdecl_38_20" id="Opdecl_29_3" title="Defined at line 38, 40, 41, 42, 44, 45, 46">Opdecl</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;

<span class="keyword">context-free sorts</span> <button class="modal-open" id="Sort_31_20" title="Multi-file references" data-urls="#Sort_16_33 line 16, 36, 50, 67; ../../deduplicated.sdf3/#Sort_29_26 line 29, 77; ../../gradual-types/signatures.sdf3/#Sort_24_24 line 24">Sort</button> <a href="#SortArg_35_29" id="SortArg_31_25" title="Referenced at line 35">SortArg</a>
<span class="keyword">context-free syntax</span>
  <button class="modal-open" id="Sort_33_3" title="Multi-file references" data-urls="#Sort_16_33 line 16, 36, 50, 67; ../../deduplicated.sdf3/#Sort_29_26 line 29, 77; ../../gradual-types/signatures.sdf3/#Sort_24_24 line 24">Sort</button>.<span class="cons_Constructor"><span id="SortVar_33_8" title="Not referenced">SortVar</span></span>    = <a href="../identifiers.sdf3/#LCID_16_22" id="LCID_33_21" title="Defined at ../identifiers.sdf3 line 16, 25, 47">LCID</a>
  <button class="modal-open" id="Sort_34_3" title="Multi-file references" data-urls="#Sort_16_33 line 16, 36, 50, 67; ../../deduplicated.sdf3/#Sort_29_26 line 29, 77; ../../gradual-types/signatures.sdf3/#Sort_24_24 line 24">Sort</button>.<span class="cons_Constructor"><span id="SortNoArgs_34_8" title="Not referenced">SortNoArgs</span></span> = <a href="../identifiers.sdf3/#UCID_16_27" id="UCID_34_21" title="Defined at ../identifiers.sdf3 line 16, 26, 48">UCID</a>
  <button class="modal-open" id="Sort_35_3" title="Multi-file references" data-urls="#Sort_16_33 line 16, 36, 50, 67; ../../deduplicated.sdf3/#Sort_29_26 line 29, 77; ../../gradual-types/signatures.sdf3/#Sort_24_24 line 24">Sort</button>.<span class="cons_Constructor"><span id="Sort_35_8" title="Not referenced">Sort</span></span>       = &lt;&lt;<a href="../identifiers.sdf3/#Id_16_15" id="Id_35_23" title="Defined at ../identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#SortArg_31_25" id="SortArg_35_29" title="Defined at line 31, 36">SortArg</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;
  <a href="#SortArg_35_29" id="SortArg_36_3" title="Referenced at line 35">SortArg</a> = <a href="#Sort_31_20" id="Sort_36_13" title="Defined at line 31, 33, 34, 35">Sort</a>

<span class="keyword">context-free sorts</span> <a href="#Opdecl_29_3" id="Opdecl_38_20" title="Referenced at line 29">Opdecl</a>
<span class="keyword">context-free syntax</span>
  <a href="#Opdecl_29_3" id="Opdecl_40_3" title="Referenced at line 29">Opdecl</a>.<span class="cons_Constructor"><span id="OpDecl_40_10" title="Not referenced">OpDecl</span></span>    = &lt;&lt;<a href="../identifiers.sdf3/#Id_16_15" id="Id_40_24" title="Defined at ../identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>&gt; <span class="cons_String">:</span> &lt;<a href="#OpType_48_65" id="OpType_40_31" title="Defined at line 48, 62, 63">OpType</a>&gt;&gt;
  <a href="#Opdecl_29_3" id="Opdecl_41_3" title="Referenced at line 29">Opdecl</a>.<span class="cons_Constructor"><span id="OpDeclQ_41_10" title="Not referenced">OpDeclQ</span></span>   = &lt;&lt;<a href="../constants.sdf3/#String_3_24" id="String_41_24" title="Defined at ../constants.sdf3 line 3, 9">String</a>&gt; <span class="cons_String">:</span> &lt;<a href="#OpType_48_65" id="OpType_41_35" title="Defined at line 48, 62, 63">OpType</a>&gt;&gt;
  <a href="#Opdecl_29_3" id="Opdecl_42_3" title="Referenced at line 29">Opdecl</a>.<span class="cons_Constructor"><span id="OpDeclInj_42_10" title="Not referenced">OpDeclInj</span></span> = &lt;<span class="cons_String">:</span> &lt;<a href="#OpType_48_65" id="OpType_42_26" title="Defined at line 48, 62, 63">OpType</a>&gt;&gt;

  <a href="#Opdecl_29_3" id="Opdecl_44_3" title="Referenced at line 29">Opdecl</a>.<span class="cons_Constructor"><span id="ExtOpDecl_44_10" title="Not referenced">ExtOpDecl</span></span>    = &lt;<span class="cons_String">external</span> &lt;<a href="../identifiers.sdf3/#Id_16_15" id="Id_44_36" title="Defined at ../identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>&gt; <span class="cons_String">:</span> &lt;<a href="#OpType_48_65" id="OpType_44_43" title="Defined at line 48, 62, 63">OpType</a>&gt;&gt;
  <a href="#Opdecl_29_3" id="Opdecl_45_3" title="Referenced at line 29">Opdecl</a>.<span class="cons_Constructor"><span id="ExtOpDeclQ_45_10" title="Not referenced">ExtOpDeclQ</span></span>   = &lt;<span class="cons_String">external</span> &lt;<a href="../constants.sdf3/#String_3_24" id="String_45_36" title="Defined at ../constants.sdf3 line 3, 9">String</a>&gt; <span class="cons_String">:</span> &lt;<a href="#OpType_48_65" id="OpType_45_47" title="Defined at line 48, 62, 63">OpType</a>&gt;&gt;
  <a href="#Opdecl_29_3" id="Opdecl_46_3" title="Referenced at line 29">Opdecl</a>.<span class="cons_Constructor"><span id="ExtOpDeclInj_46_10" title="Not referenced">ExtOpDeclInj</span></span> = &lt;<span class="cons_String">external</span> <span class="cons_String">:</span> &lt;<a href="#OpType_48_65" id="OpType_46_38" title="Defined at line 48, 62, 63">OpType</a>&gt;&gt;

<span class="keyword">context-free sorts</span> <button class="modal-open" id="OldType_48_20" title="Multi-file references" data-urls="#OldType_54_19 line 54, 56; ../strategies.sdf3/#OldType_50_29 line 50">OldType</button> <a href="#OldArgType_52_24" id="OldArgType_48_28" title="Referenced at line 52">OldArgType</a> <button class="modal-open" id="ConstType_48_39" title="Multi-file references" data-urls="#ConstType_55_16 line 55, 60, 62, 63; ../../gradual-types/overlays.sdf3/#ConstType_10_15 line 10, 13">ConstType</button> <a href="#FunType_57_13" id="FunType_48_49" title="Referenced at line 57, 59">FunType</a> <a href="#RetType_52_48" id="RetType_48_57" title="Referenced at line 52">RetType</a> <a href="#OpType_40_31" id="OpType_48_65" title="Referenced at line 40, 41, 42, 44, 45, 46">OpType</a>
<span class="keyword">context-free syntax</span>
  <button class="modal-open" id="ConstType_50_3" title="Multi-file references" data-urls="#ConstType_55_16 line 55, 60, 62, 63; ../../gradual-types/overlays.sdf3/#ConstType_10_15 line 10, 13">ConstType</button>.<span class="cons_Constructor"><span id="ConstType_50_13" title="Not referenced">ConstType</span></span> = <a href="#Sort_31_20" id="Sort_50_25" title="Defined at line 31, 33, 34, 35">Sort</a>

  <a href="#FunType_57_13" id="FunType_52_3" title="Referenced at line 57, 59">FunType</a>.<span class="cons_Constructor"><span id="FunType_52_11" title="Not referenced">FunType</span></span> = [[{<a href="#OldArgType_48_28" id="OldArgType_52_24" title="Defined at line 48, 54, 55">OldArgType</a> <span class="cons_Lit">" * "</span>}+] <span class="cons_String">-&gt;</span> [<a href="#RetType_48_57" id="RetType_52_48" title="Defined at line 48, 56, 57">RetType</a>]]

  <a href="#OldArgType_52_24" id="OldArgType_54_3" title="Referenced at line 52">OldArgType</a> = &lt;<span class="cons_String">(</span>&lt;<a href="#OldType_48_20" id="OldType_54_19" title="Defined at line 48, 59, 60">OldType</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}
  <a href="#OldArgType_52_24" id="OldArgType_55_3" title="Referenced at line 52">OldArgType</a> = <a href="#ConstType_48_39" id="ConstType_55_16" title="Defined at line 48, 50">ConstType</a>
  <a href="#RetType_52_48" id="RetType_56_3" title="Referenced at line 52">RetType</a> = <a href="#OldType_48_20" id="OldType_56_13" title="Defined at line 48, 59, 60">OldType</a>
  <a href="#RetType_52_48" id="RetType_57_3" title="Referenced at line 52">RetType</a> = <a href="#FunType_48_49" id="FunType_57_13" title="Defined at line 48, 52">FunType</a> {<span class="keyword">reject</span>}

  <button class="modal-open" id="OldType_59_3" title="Multi-file references" data-urls="#OldType_54_19 line 54, 56; ../strategies.sdf3/#OldType_50_29 line 50">OldType</button> = <a href="#FunType_48_49" id="FunType_59_13" title="Defined at line 48, 52">FunType</a>
  <button class="modal-open" id="OldType_60_3" title="Multi-file references" data-urls="#OldType_54_19 line 54, 56; ../strategies.sdf3/#OldType_50_29 line 50">OldType</button> = <a href="#ConstType_48_39" id="ConstType_60_13" title="Defined at line 48, 50">ConstType</a>

  <a href="#OpType_40_31" id="OpType_62_3" title="Referenced at line 40, 41, 42, 44, 45, 46">OpType</a> = <a href="#ConstType_48_39" id="ConstType_62_12" title="Defined at line 48, 50">ConstType</a>
  <a href="#OpType_40_31" id="OpType_63_3" title="Referenced at line 40, 41, 42, 44, 45, 46">OpType</a>.<span class="cons_Constructor"><span id="OpFunType_63_10" title="Not referenced">OpFunType</span></span> = [[{<a href="#ConstType_48_39" id="ConstType_63_25" title="Defined at line 48, 50">ConstType</a> <span class="cons_Lit">" * "</span>}+] <span class="cons_String">-&gt;</span> [<a href="#ConstType_48_39" id="ConstType_63_48" title="Defined at line 48, 50">ConstType</a>]]

<span class="layout">// Restriction is required for the Sort* in Sdecl: List(a) is ambiguous.</span>
<span class="keyword">context-free restrictions</span>
  <a href="#Sort_31_20" id="Sort_67_3" title="Defined at line 31, 33, 34, 35">Sort</a> -/- [\(]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
