---
title: signatures-namespaced.sdf3
hide:
  - toc
---

# `signatures-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/core/signatures-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/core/signatures-namespaced.sdf3 "The source file on GitHub"

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
68
69
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="StrategoLang/core/signatures-namespaced_1_8" title="Multi-file references" data-urls="../main-namespaced.sdf3/#StrategoLang/core/signatures-namespaced_7_3 line 7; ../modules-namespaced.sdf3/#StrategoLang/core/signatures-namespaced_6_3 line 6; ../strategies-namespaced.sdf3/#StrategoLang/core/signatures-namespaced_6_3 line 6; ../../deduplicated-namespaced.sdf3/#StrategoLang/core/signatures-namespaced_5_3 line 5; ../../gradual-types/overlays-namespaced.sdf3/#StrategoLang/core/signatures-namespaced_5_3 line 5; ../../gradual-types/signatures-namespaced.sdf3/#StrategoLang/core/signatures-namespaced_5_3 line 5; ../../sugar/dynamic-rules-namespaced.sdf3/#StrategoLang/core/signatures-namespaced_6_3 line 6; ../../sugar/rules-namespaced.sdf3/#StrategoLang/core/signatures-namespaced_5_3 line 5; ../../sugar/signatures-namespaced.sdf3/#StrategoLang/core/signatures-namespaced_4_3 line 4">StrategoLang/core/signatures-namespaced</button>

<span class="keyword">imports</span>
  <a href="../identifiers-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_1_8" id="StrategoLang/core/identifiers-namespaced_4_3" title="Defined at ../identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>        
  <a href="../constants-namespaced.sdf3/#StrategoLang/core/constants-namespaced_1_8" id="StrategoLang/core/constants-namespaced_5_3" title="Defined at ../constants-namespaced.sdf3 line 1">StrategoLang/core/constants-namespaced</a>

<span class="keyword">sorts</span> <button class="modal-open" id="StrategoLang-Kind_7_7" title="Multi-file references" data-urls="#StrategoLang-Kind_19_57 line 19, 21; ../../deduplicated-namespaced.sdf3/#StrategoLang-Kind_23_54 line 23, 25">StrategoLang-Kind</button>

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="StrategoLang-Kind_11_3" title="Multi-file references" data-urls="#StrategoLang-Kind_19_57 line 19, 21; ../../deduplicated-namespaced.sdf3/#StrategoLang-Kind_23_54 line 23, 25">StrategoLang-Kind</button>.<span class="cons_Constructor"><span id="Star_11_21" title="Not referenced">Star</span></span> = &lt;<span class="cons_String">*</span>&gt; { }

<span class="keyword">sorts</span> <a href="#StrategoLang-SortDef_27_38" id="StrategoLang-SortDef_13_7" title="Referenced at line 27">StrategoLang-SortDef</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-SortDef_27_38" id="StrategoLang-SortDef_17_3" title="Referenced at line 27">StrategoLang-SortDef</a>.<span class="cons_Constructor"><span id="SortDefVar_17_24" title="Not referenced">SortDefVar</span></span> = <a href="../identifiers-namespaced.sdf3/#StrategoLang-LCID_30_3" id="StrategoLang-LCID_17_37" title="Defined at ../identifiers-namespaced.sdf3 line 30, 53">StrategoLang-LCID</a> {<span class="keyword">deprecated</span>("This syntax never had a clear meaning should not be used")}
  <a href="#StrategoLang-SortDef_27_38" id="StrategoLang-SortDef_18_3" title="Referenced at line 27">StrategoLang-SortDef</a>.<span class="cons_Constructor"><span id="SortDefNoArgs_18_24" title="Not referenced">SortDefNoArgs</span></span> = <a href="../identifiers-namespaced.sdf3/#StrategoLang-UCID_31_3" id="StrategoLang-UCID_18_40" title="Defined at ../identifiers-namespaced.sdf3 line 31, 54">StrategoLang-UCID</a> { }
  <a href="#StrategoLang-SortDef_27_38" id="StrategoLang-SortDef_19_3" title="Referenced at line 27">StrategoLang-SortDef</a>.<span class="cons_Constructor"><span id="SortDef_19_24" title="Not referenced">SortDef</span></span> = [[<a href="../identifiers-namespaced.sdf3/#StrategoLang-UCID_31_3" id="StrategoLang-UCID_19_36" title="Defined at ../identifiers-namespaced.sdf3 line 31, 54">StrategoLang-UCID</a>]<span class="cons_String">(</span>[{<a href="#StrategoLang-Kind_7_7" id="StrategoLang-Kind_19_57" title="Defined at line 7, 11">StrategoLang-Kind</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>] { }
  <a href="#StrategoLang-SortDef_27_38" id="StrategoLang-SortDef_20_3" title="Referenced at line 27">StrategoLang-SortDef</a>.<span class="cons_Constructor"><span id="SortDefDepr_20_24" title="Not referenced">SortDefDepr</span></span> = &lt;&lt;<a href="../identifiers-namespaced.sdf3/#StrategoLang-Id_27_3" id="StrategoLang-Id_20_40" title="Defined at ../identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#StrategoLang-Sort_32_7" id="StrategoLang-Sort_20_59" title="Defined at line 32, 36, 37, 38">StrategoLang-Sort</a> <span class="cons_Lit">", "</span>}+&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">deprecated</span>("This syntax never had a clear meaning should be replaced by the version that uses kinds A(*, *)")}
  <a href="#StrategoLang-SortDef_27_38" id="StrategoLang-SortDef_21_3" title="Referenced at line 27">StrategoLang-SortDef</a>.<span class="cons_Constructor"><span id="ExtSortDef_21_24" title="Not referenced">ExtSortDef</span></span> = [<span class="cons_String">external</span> [<a href="../identifiers-namespaced.sdf3/#StrategoLang-UCID_31_3" id="StrategoLang-UCID_21_48" title="Defined at ../identifiers-namespaced.sdf3 line 31, 54">StrategoLang-UCID</a>]<span class="cons_String">(</span>[{<a href="#StrategoLang-Kind_7_7" id="StrategoLang-Kind_21_69" title="Defined at line 7, 11">StrategoLang-Kind</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>] { }

<span class="keyword">sorts</span> <span id="StrategoLang-Sdecl_23_7" title="Not referenced">StrategoLang-Sdecl</span>

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-Sdecl_27_3" title="Not referenced">StrategoLang-Sdecl</span>.<span class="cons_Constructor"><span id="Sorts_27_22" title="Not referenced">Sorts</span></span> = &lt;<span class="cons_String">sorts</span> &lt;<a href="#StrategoLang-SortDef_13_7" id="StrategoLang-SortDef_27_38" title="Defined at line 13, 17, 18, 19, 20, 21">StrategoLang-SortDef</a>*&gt;&gt; { }
  <span id="StrategoLang-Sdecl_28_3" title="Not referenced">StrategoLang-Sdecl</span>.<span class="cons_Constructor"><span id="Constructors_28_22" title="Not referenced">Constructors</span></span> = &lt;<span class="cons_String">constructors</span>

&lt;{<a href="#StrategoLang-Opdecl_41_7" id="StrategoLang-Opdecl_30_3" title="Defined at line 41, 45, 46, 47, 48, 49, 50">StrategoLang-Opdecl</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt; { }

<span class="keyword">sorts</span> <button class="modal-open" id="StrategoLang-Sort_32_7" title="Multi-file references" data-urls="#StrategoLang-Sort_20_59 line 20, 39, 56, 69; ../../deduplicated-namespaced.sdf3/#StrategoLang-Sort_24_52 line 24, 63; ../../gradual-types/signatures-namespaced.sdf3/#StrategoLang-Sort_25_37 line 25">StrategoLang-Sort</button> <a href="#StrategoLang-SortArg_38_49" id="StrategoLang-SortArg_32_25" title="Referenced at line 38">StrategoLang-SortArg</a>

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="StrategoLang-Sort_36_3" title="Multi-file references" data-urls="#StrategoLang-Sort_20_59 line 20, 39, 56, 69; ../../deduplicated-namespaced.sdf3/#StrategoLang-Sort_24_52 line 24, 63; ../../gradual-types/signatures-namespaced.sdf3/#StrategoLang-Sort_25_37 line 25">StrategoLang-Sort</button>.<span class="cons_Constructor"><span id="SortVar_36_21" title="Not referenced">SortVar</span></span> = <a href="../identifiers-namespaced.sdf3/#StrategoLang-LCID_30_3" id="StrategoLang-LCID_36_31" title="Defined at ../identifiers-namespaced.sdf3 line 30, 53">StrategoLang-LCID</a> { }
  <button class="modal-open" id="StrategoLang-Sort_37_3" title="Multi-file references" data-urls="#StrategoLang-Sort_20_59 line 20, 39, 56, 69; ../../deduplicated-namespaced.sdf3/#StrategoLang-Sort_24_52 line 24, 63; ../../gradual-types/signatures-namespaced.sdf3/#StrategoLang-Sort_25_37 line 25">StrategoLang-Sort</button>.<span class="cons_Constructor"><span id="SortNoArgs_37_21" title="Not referenced">SortNoArgs</span></span> = <a href="../identifiers-namespaced.sdf3/#StrategoLang-UCID_31_3" id="StrategoLang-UCID_37_34" title="Defined at ../identifiers-namespaced.sdf3 line 31, 54">StrategoLang-UCID</a> { }
  <button class="modal-open" id="StrategoLang-Sort_38_3" title="Multi-file references" data-urls="#StrategoLang-Sort_20_59 line 20, 39, 56, 69; ../../deduplicated-namespaced.sdf3/#StrategoLang-Sort_24_52 line 24, 63; ../../gradual-types/signatures-namespaced.sdf3/#StrategoLang-Sort_25_37 line 25">StrategoLang-Sort</button>.<span class="cons_Constructor"><span id="Sort_38_21" title="Not referenced">Sort</span></span> = &lt;&lt;<a href="../identifiers-namespaced.sdf3/#StrategoLang-Id_27_3" id="StrategoLang-Id_38_30" title="Defined at ../identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#StrategoLang-SortArg_32_25" id="StrategoLang-SortArg_38_49" title="Defined at line 32, 39">StrategoLang-SortArg</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-SortArg_38_49" id="StrategoLang-SortArg_39_3" title="Referenced at line 38">StrategoLang-SortArg</a> = <a href="#StrategoLang-Sort_32_7" id="StrategoLang-Sort_39_26" title="Defined at line 32, 36, 37, 38">StrategoLang-Sort</a> { }

<span class="keyword">sorts</span> <a href="#StrategoLang-Opdecl_30_3" id="StrategoLang-Opdecl_41_7" title="Referenced at line 30">StrategoLang-Opdecl</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Opdecl_30_3" id="StrategoLang-Opdecl_45_3" title="Referenced at line 30">StrategoLang-Opdecl</a>.<span class="cons_Constructor"><span id="OpDecl_45_23" title="Not referenced">OpDecl</span></span> = &lt;&lt;<a href="../identifiers-namespaced.sdf3/#StrategoLang-Id_27_3" id="StrategoLang-Id_45_34" title="Defined at ../identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a>&gt; <span class="cons_String">:</span> &lt;<a href="#StrategoLang-OpType_52_117" id="StrategoLang-OpType_45_54" title="Defined at line 52, 64, 65">StrategoLang-OpType</a>&gt;&gt; { }
  <a href="#StrategoLang-Opdecl_30_3" id="StrategoLang-Opdecl_46_3" title="Referenced at line 30">StrategoLang-Opdecl</a>.<span class="cons_Constructor"><span id="OpDeclQ_46_23" title="Not referenced">OpDeclQ</span></span> = &lt;&lt;<a href="../constants-namespaced.sdf3/#StrategoLang-String_10_3" id="StrategoLang-String_46_35" title="Defined at ../constants-namespaced.sdf3 line 10">StrategoLang-String</a>&gt; <span class="cons_String">:</span> &lt;<a href="#StrategoLang-OpType_52_117" id="StrategoLang-OpType_46_59" title="Defined at line 52, 64, 65">StrategoLang-OpType</a>&gt;&gt; { }
  <a href="#StrategoLang-Opdecl_30_3" id="StrategoLang-Opdecl_47_3" title="Referenced at line 30">StrategoLang-Opdecl</a>.<span class="cons_Constructor"><span id="OpDeclInj_47_23" title="Not referenced">OpDeclInj</span></span> = &lt;<span class="cons_String">:</span> &lt;<a href="#StrategoLang-OpType_52_117" id="StrategoLang-OpType_47_39" title="Defined at line 52, 64, 65">StrategoLang-OpType</a>&gt;&gt; { }
  <a href="#StrategoLang-Opdecl_30_3" id="StrategoLang-Opdecl_48_3" title="Referenced at line 30">StrategoLang-Opdecl</a>.<span class="cons_Constructor"><span id="ExtOpDecl_48_23" title="Not referenced">ExtOpDecl</span></span> = &lt;<span class="cons_String">external</span> &lt;<a href="../identifiers-namespaced.sdf3/#StrategoLang-Id_27_3" id="StrategoLang-Id_48_46" title="Defined at ../identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a>&gt; <span class="cons_String">:</span> &lt;<a href="#StrategoLang-OpType_52_117" id="StrategoLang-OpType_48_66" title="Defined at line 52, 64, 65">StrategoLang-OpType</a>&gt;&gt; { }
  <a href="#StrategoLang-Opdecl_30_3" id="StrategoLang-Opdecl_49_3" title="Referenced at line 30">StrategoLang-Opdecl</a>.<span class="cons_Constructor"><span id="ExtOpDeclQ_49_23" title="Not referenced">ExtOpDeclQ</span></span> = &lt;<span class="cons_String">external</span> &lt;<a href="../constants-namespaced.sdf3/#StrategoLang-String_10_3" id="StrategoLang-String_49_47" title="Defined at ../constants-namespaced.sdf3 line 10">StrategoLang-String</a>&gt; <span class="cons_String">:</span> &lt;<a href="#StrategoLang-OpType_52_117" id="StrategoLang-OpType_49_71" title="Defined at line 52, 64, 65">StrategoLang-OpType</a>&gt;&gt; { }
  <a href="#StrategoLang-Opdecl_30_3" id="StrategoLang-Opdecl_50_3" title="Referenced at line 30">StrategoLang-Opdecl</a>.<span class="cons_Constructor"><span id="ExtOpDeclInj_50_23" title="Not referenced">ExtOpDeclInj</span></span> = &lt;<span class="cons_String">external</span> <span class="cons_String">:</span> &lt;<a href="#StrategoLang-OpType_52_117" id="StrategoLang-OpType_50_51" title="Defined at line 52, 64, 65">StrategoLang-OpType</a>&gt;&gt; { }

<span class="keyword">sorts</span> <button class="modal-open" id="StrategoLang-OldType_52_7" title="Multi-file references" data-urls="#StrategoLang-OldType_58_32 line 58, 60; ../strategies-namespaced.sdf3/#StrategoLang-OldType_52_55 line 52">StrategoLang-OldType</button> <a href="#StrategoLang-OldArgType_57_37" id="StrategoLang-OldArgType_52_28" title="Referenced at line 57">StrategoLang-OldArgType</a> <button class="modal-open" id="StrategoLang-ConstType_52_52" title="Multi-file references" data-urls="#StrategoLang-ConstType_59_29 line 59, 63, 64, 65; ../../gradual-types/overlays-namespaced.sdf3/#StrategoLang-ConstType_11_67 line 11, 12">StrategoLang-ConstType</button> <a href="#StrategoLang-FunType_61_26" id="StrategoLang-FunType_52_75" title="Referenced at line 61, 62">StrategoLang-FunType</a> <a href="#StrategoLang-RetType_57_74" id="StrategoLang-RetType_52_96" title="Referenced at line 57">StrategoLang-RetType</a> <a href="#StrategoLang-OpType_45_54" id="StrategoLang-OpType_52_117" title="Referenced at line 45, 46, 47, 48, 49, 50">StrategoLang-OpType</a>

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="StrategoLang-ConstType_56_3" title="Multi-file references" data-urls="#StrategoLang-ConstType_59_29 line 59, 63, 64, 65; ../../gradual-types/overlays-namespaced.sdf3/#StrategoLang-ConstType_11_67 line 11, 12">StrategoLang-ConstType</button>.<span class="cons_Constructor"><span id="ConstType_56_26" title="Not referenced">ConstType</span></span> = <a href="#StrategoLang-Sort_32_7" id="StrategoLang-Sort_56_38" title="Defined at line 32, 36, 37, 38">StrategoLang-Sort</a> { }
  <a href="#StrategoLang-FunType_61_26" id="StrategoLang-FunType_57_3" title="Referenced at line 61, 62">StrategoLang-FunType</a>.<span class="cons_Constructor"><span id="FunType_57_24" title="Not referenced">FunType</span></span> = [[{<a href="#StrategoLang-OldArgType_52_28" id="StrategoLang-OldArgType_57_37" title="Defined at line 52, 58, 59">StrategoLang-OldArgType</a> <span class="cons_Lit">" * "</span>}+] <span class="cons_String">-&gt;</span> [<a href="#StrategoLang-RetType_52_96" id="StrategoLang-RetType_57_74" title="Defined at line 52, 60, 61">StrategoLang-RetType</a>]] { }
  <a href="#StrategoLang-OldArgType_57_37" id="StrategoLang-OldArgType_58_3" title="Referenced at line 57">StrategoLang-OldArgType</a> = &lt;<span class="cons_String">(</span>&lt;<a href="#StrategoLang-OldType_52_7" id="StrategoLang-OldType_58_32" title="Defined at line 52, 62, 63">StrategoLang-OldType</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}
  <a href="#StrategoLang-OldArgType_57_37" id="StrategoLang-OldArgType_59_3" title="Referenced at line 57">StrategoLang-OldArgType</a> = <a href="#StrategoLang-ConstType_52_52" id="StrategoLang-ConstType_59_29" title="Defined at line 52, 56">StrategoLang-ConstType</a> { }
  <a href="#StrategoLang-RetType_57_74" id="StrategoLang-RetType_60_3" title="Referenced at line 57">StrategoLang-RetType</a> = <a href="#StrategoLang-OldType_52_7" id="StrategoLang-OldType_60_26" title="Defined at line 52, 62, 63">StrategoLang-OldType</a> { }
  <a href="#StrategoLang-RetType_57_74" id="StrategoLang-RetType_61_3" title="Referenced at line 57">StrategoLang-RetType</a> = <a href="#StrategoLang-FunType_52_75" id="StrategoLang-FunType_61_26" title="Defined at line 52, 57">StrategoLang-FunType</a> {<span class="keyword">reject</span>}
  <button class="modal-open" id="StrategoLang-OldType_62_3" title="Multi-file references" data-urls="#StrategoLang-OldType_58_32 line 58, 60; ../strategies-namespaced.sdf3/#StrategoLang-OldType_52_55 line 52">StrategoLang-OldType</button> = <a href="#StrategoLang-FunType_52_75" id="StrategoLang-FunType_62_26" title="Defined at line 52, 57">StrategoLang-FunType</a> { }
  <button class="modal-open" id="StrategoLang-OldType_63_3" title="Multi-file references" data-urls="#StrategoLang-OldType_58_32 line 58, 60; ../strategies-namespaced.sdf3/#StrategoLang-OldType_52_55 line 52">StrategoLang-OldType</button> = <a href="#StrategoLang-ConstType_52_52" id="StrategoLang-ConstType_63_26" title="Defined at line 52, 56">StrategoLang-ConstType</a> { }
  <a href="#StrategoLang-OpType_45_54" id="StrategoLang-OpType_64_3" title="Referenced at line 45, 46, 47, 48, 49, 50">StrategoLang-OpType</a> = <a href="#StrategoLang-ConstType_52_52" id="StrategoLang-ConstType_64_25" title="Defined at line 52, 56">StrategoLang-ConstType</a> { }
  <a href="#StrategoLang-OpType_45_54" id="StrategoLang-OpType_65_3" title="Referenced at line 45, 46, 47, 48, 49, 50">StrategoLang-OpType</a>.<span class="cons_Constructor"><span id="OpFunType_65_23" title="Not referenced">OpFunType</span></span> = [[{<a href="#StrategoLang-ConstType_52_52" id="StrategoLang-ConstType_65_38" title="Defined at line 52, 56">StrategoLang-ConstType</a> <span class="cons_Lit">" * "</span>}+] <span class="cons_String">-&gt;</span> [<a href="#StrategoLang-ConstType_52_52" id="StrategoLang-ConstType_65_74" title="Defined at line 52, 56">StrategoLang-ConstType</a>]] { }

<span class="keyword">context-free restrictions</span>

  <a href="#StrategoLang-Sort_32_7" id="StrategoLang-Sort_69_3" title="Defined at line 32, 36, 37, 38">StrategoLang-Sort</a> -/- [\(]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
