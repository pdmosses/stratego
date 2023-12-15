---
title: deduplicated-namespaced.sdf3
hide:
  - toc
---

# `deduplicated-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/deduplicated-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/deduplicated-namespaced.sdf3 "The source file on GitHub"

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
70
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="StrategoLang/deduplicated-namespaced_1_8" title="Not referenced">StrategoLang/deduplicated-namespaced</span>

<span class="keyword">imports</span>
  <a href="../core/terms-namespaced.sdf3/#StrategoLang/core/terms-namespaced_1_8" id="StrategoLang/core/terms-namespaced_4_3" title="Defined at ../core/terms-namespaced.sdf3 line 1">StrategoLang/core/terms-namespaced</a>        
  <a href="../core/signatures-namespaced.sdf3/#StrategoLang/core/signatures-namespaced_1_8" id="StrategoLang/core/signatures-namespaced_5_3" title="Defined at ../core/signatures-namespaced.sdf3 line 1">StrategoLang/core/signatures-namespaced</a>        
  <a href="../core/identifiers-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_1_8" id="StrategoLang/core/identifiers-namespaced_6_3" title="Defined at ../core/identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>        
  <a href="../sugar/terms-namespaced.sdf3/#StrategoLang/sugar/terms-namespaced_1_8" id="StrategoLang/sugar/terms-namespaced_7_3" title="Defined at ../sugar/terms-namespaced.sdf3 line 1">StrategoLang/sugar/terms-namespaced</a>        
  <a href="../sugar/rules-namespaced.sdf3/#StrategoLang/sugar/rules-namespaced_1_8" id="StrategoLang/sugar/rules-namespaced_8_3" title="Defined at ../sugar/rules-namespaced.sdf3 line 1">StrategoLang/sugar/rules-namespaced</a>        
  <a href="../core/strategies-namespaced.sdf3/#StrategoLang/core/strategies-namespaced_1_8" id="StrategoLang/core/strategies-namespaced_9_3" title="Defined at ../core/strategies-namespaced.sdf3 line 1">StrategoLang/core/strategies-namespaced</a>        
  <a href="../sugar/dynamic-rules-namespaced.sdf3/#StrategoLang/sugar/dynamic-rules-namespaced_1_8" id="StrategoLang/sugar/dynamic-rules-namespaced_10_3" title="Defined at ../sugar/dynamic-rules-namespaced.sdf3 line 1">StrategoLang/sugar/dynamic-rules-namespaced</a>        
  <a href="../sugar/string-quotations-namespaced.sdf3/#StrategoLang/sugar/string-quotations-namespaced_1_8" id="StrategoLang/sugar/string-quotations-namespaced_11_3" title="Defined at ../sugar/string-quotations-namespaced.sdf3 line 1">StrategoLang/sugar/string-quotations-namespaced</a>        
  <a href="../gradual-types/signatures-namespaced.sdf3/#StrategoLang/gradual-types/signatures-namespaced_1_8" id="StrategoLang/gradual-types/signatures-namespaced_12_3" title="Defined at ../gradual-types/signatures-namespaced.sdf3 line 1">StrategoLang/gradual-types/signatures-namespaced</a>        
  <a href="../gradual-types/strategies-namespaced.sdf3/#StrategoLang/gradual-types/strategies-namespaced_1_8" id="StrategoLang/gradual-types/strategies-namespaced_13_3" title="Defined at ../gradual-types/strategies-namespaced.sdf3 line 1">StrategoLang/gradual-types/strategies-namespaced</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-PreTerm_17_50" id="StrategoLang-PreTerm_17_3" title="Referenced at line 17">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><span id="As_17_24" title="Not referenced">As</span></span> = &lt;&lt;<a href="../core/terms-namespaced.sdf3/#StrategoLang-Var_7_23" id="StrategoLang-Var_17_31" title="Defined at ../core/terms-namespaced.sdf3 line 7, 11">StrategoLang-Var</a>&gt;<span class="cons_String">@</span>&lt;<a href="#StrategoLang-PreTerm_17_3" id="StrategoLang-PreTerm_17_50" title="Defined at line 17, 30, 31">StrategoLang-PreTerm</a>&gt;&gt; { }

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-SortDef_21_3" title="Not referenced">StrategoLang-SortDef</span>.<span class="cons_Constructor"><span id="SortVar_21_24" title="Not referenced">SortVar</span></span> = <a href="../core/identifiers-namespaced.sdf3/#StrategoLang-LCID_30_3" id="StrategoLang-LCID_21_34" title="Defined at ../core/identifiers-namespaced.sdf3 line 30, 53">StrategoLang-LCID</a> {<span class="keyword">deprecated</span>("This syntax never had a clear meaning should not be used")}
  <span id="StrategoLang-SortDef_22_3" title="Not referenced">StrategoLang-SortDef</span>.<span class="cons_Constructor"><span id="SortNoArgs_22_24" title="Not referenced">SortNoArgs</span></span> = <a href="../core/identifiers-namespaced.sdf3/#StrategoLang-UCID_31_3" id="StrategoLang-UCID_22_37" title="Defined at ../core/identifiers-namespaced.sdf3 line 31, 54">StrategoLang-UCID</a> { }
  <span id="StrategoLang-SortDef_23_3" title="Not referenced">StrategoLang-SortDef</span>.<span class="cons_Constructor"><span id="Sort_23_24" title="Not referenced">Sort</span></span> = [[<a href="../core/identifiers-namespaced.sdf3/#StrategoLang-UCID_31_3" id="StrategoLang-UCID_23_33" title="Defined at ../core/identifiers-namespaced.sdf3 line 31, 54">StrategoLang-UCID</a>]<span class="cons_String">(</span>[{<a href="../core/signatures-namespaced.sdf3/#StrategoLang-Kind_7_7" id="StrategoLang-Kind_23_54" title="Defined at ../core/signatures-namespaced.sdf3 line 7, 11">StrategoLang-Kind</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>] { }
  <span id="StrategoLang-SortDef_24_3" title="Not referenced">StrategoLang-SortDef</span>.<span class="cons_Constructor"><span id="Sort_24_24" title="Not referenced">Sort</span></span> = &lt;&lt;<a href="../core/identifiers-namespaced.sdf3/#StrategoLang-Id_27_3" id="StrategoLang-Id_24_33" title="Defined at ../core/identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../core/signatures-namespaced.sdf3/#StrategoLang-Sort_32_7" id="StrategoLang-Sort_24_52" title="Defined at ../core/signatures-namespaced.sdf3 line 32, 36, 37, 38">StrategoLang-Sort</a> <span class="cons_Lit">", "</span>}+&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">deprecated</span>("This syntax never had a clear meaning should be replaced by the version that uses kinds A(*, *)")}
  <span id="StrategoLang-SortDef_25_3" title="Not referenced">StrategoLang-SortDef</span>.<span class="cons_Constructor"><span id="ExtSort_25_24" title="Not referenced">ExtSort</span></span> = [<span class="cons_String">external</span> [<a href="../core/identifiers-namespaced.sdf3/#StrategoLang-UCID_31_3" id="StrategoLang-UCID_25_45" title="Defined at ../core/identifiers-namespaced.sdf3 line 31, 54">StrategoLang-UCID</a>]<span class="cons_String">(</span>[{<a href="../core/signatures-namespaced.sdf3/#StrategoLang-Kind_7_7" id="StrategoLang-Kind_25_66" title="Defined at ../core/signatures-namespaced.sdf3 line 7, 11">StrategoLang-Kind</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>] { }
  <span id="StrategoLang-OpType_26_3" title="Not referenced">StrategoLang-OpType</span>.<span class="cons_Constructor"><span id="FunType_26_23" title="Not referenced">FunType</span></span> = [[{<a href="#StrategoLang-ConstType_59_3" id="StrategoLang-ConstType_26_36" title="Defined at line 59">StrategoLang-ConstType</a> <span class="cons_Lit">" * "</span>}+] <span class="cons_String">-&gt;</span> [<a href="#StrategoLang-ConstType_59_3" id="StrategoLang-ConstType_26_72" title="Defined at line 59">StrategoLang-ConstType</a>]] { }

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-PreTerm_17_50" id="StrategoLang-PreTerm_30_3" title="Referenced at line 17">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><span id="App_30_24" title="Not referenced">App</span></span> = [<span class="cons_String">&lt;</span>[<a href="#StrategoLang-Strategy_39_3" id="StrategoLang-Strategy_30_33" title="Defined at line 39, 40">StrategoLang-Strategy</a>]<span class="cons_String">&gt;</span> [<a href="../core/terms-namespaced.sdf3/#StrategoLang-Term_15_7" id="StrategoLang-Term_30_58" title="Defined at ../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>]] { }
  <a href="#StrategoLang-PreTerm_17_50" id="StrategoLang-PreTerm_31_3" title="Referenced at line 17">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><span id="RootApp_31_24" title="Not referenced">RootApp</span></span> = [<span class="cons_String">&lt;</span>[<a href="#StrategoLang-Strategy_39_3" id="StrategoLang-Strategy_31_37" title="Defined at line 39, 40">StrategoLang-Strategy</a>]<span class="cons_String">&gt;</span>] { }

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-Def_35_3" title="Not referenced">StrategoLang-Def</span>.<span class="cons_Constructor"><span id="AnnoDef_35_20" title="Not referenced">AnnoDef</span></span> = &lt;&lt;<a href="../core/strategies-namespaced.sdf3/#StrategoLang-Anno_40_7" id="StrategoLang-Anno_35_32" title="Defined at ../core/strategies-namespaced.sdf3 line 40, 44, 45, 46">StrategoLang-Anno</a>+&gt; &lt;StrategoLang-RuleDef&gt;&gt; { }

<span class="keyword">syntax</span>

  <a href="#StrategoLang-Strategy_30_33" id="StrategoLang-Strategy_39_3" title="Referenced at line 30, 31, 39, 40">StrategoLang-Strategy</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DynRuleUnionFix_39_28" title="Not referenced">DynRuleUnionFix</span></span> = <span class="cons_Lit">"\\"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> StrategoLang-RuleNames<span class="keyword">-CF</span> <span class="cons_Lit">" /*"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#StrategoLang-Strategy_39_3" id="StrategoLang-Strategy_39_105" title="Defined at line 39, 40">StrategoLang-Strategy</a><span class="keyword">-CF</span> { }
  <a href="#StrategoLang-Strategy_30_33" id="StrategoLang-Strategy_40_3" title="Referenced at line 30, 31, 39, 40">StrategoLang-Strategy</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DynRuleIntersectUnionFix_40_28" title="Not referenced">DynRuleIntersectUnionFix</span></span> = <span class="cons_Lit">"/"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> StrategoLang-RuleNames<span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"\\"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> StrategoLang-RuleNames<span class="keyword">-CF</span> <span class="cons_Lit">" /*"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#StrategoLang-Strategy_39_3" id="StrategoLang-Strategy_40_166" title="Defined at line 39, 40">StrategoLang-Strategy</a><span class="keyword">-CF</span> { }

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-StringQuotedPart1_44_3" title="Not referenced">StrategoLang-StringQuotedPart1</span>.<span class="cons_Constructor"><span id="QStr_44_34" title="Not referenced">QStr</span></span> = StrategoLang-StringQuotedChars1 { }
  <span id="StrategoLang-StringQuotedPart2_45_3" title="Not referenced">StrategoLang-StringQuotedPart2</span>.<span class="cons_Constructor"><span id="QStr_45_34" title="Not referenced">QStr</span></span> = StrategoLang-StringQuotedChars2 { }
  <span id="StrategoLang-StringQuotedPart3_46_3" title="Not referenced">StrategoLang-StringQuotedPart3</span>.<span class="cons_Constructor"><span id="QStr_46_34" title="Not referenced">QStr</span></span> = StrategoLang-StringQuotedChars3 { }
  <span id="StrategoLang-StringQuotedPart4_47_3" title="Not referenced">StrategoLang-StringQuotedPart4</span>.<span class="cons_Constructor"><span id="QStr_47_34" title="Not referenced">QStr</span></span> = StrategoLang-StringQuotedChars4 { }
  <span id="StrategoLang-StringQuotedPart1_48_3" title="Not referenced">StrategoLang-StringQuotedPart1</span>.<span class="cons_Constructor"><span id="QDollar_48_34" title="Not referenced">QDollar</span></span> = StrategoLang-Dollar1 { }
  <span id="StrategoLang-StringQuotedPart2_49_3" title="Not referenced">StrategoLang-StringQuotedPart2</span>.<span class="cons_Constructor"><span id="QDollar_49_34" title="Not referenced">QDollar</span></span> = StrategoLang-Dollar2 { }
  <span id="StrategoLang-StringQuotedPart3_50_3" title="Not referenced">StrategoLang-StringQuotedPart3</span>.<span class="cons_Constructor"><span id="QDollar_50_34" title="Not referenced">QDollar</span></span> = StrategoLang-Dollar3 { }
  <span id="StrategoLang-StringQuotedPart4_51_3" title="Not referenced">StrategoLang-StringQuotedPart4</span>.<span class="cons_Constructor"><span id="QDollar_51_34" title="Not referenced">QDollar</span></span> = StrategoLang-Dollar4 { }
  <span id="StrategoLang-StringQuotedPart1_52_3" title="Not referenced">StrategoLang-StringQuotedPart1</span>.<span class="cons_Constructor"><span id="QBr_52_34" title="Not referenced">QBr</span></span> = StrategoLang-QuotedBracket1 { }
  <span id="StrategoLang-StringQuotedPart2_53_3" title="Not referenced">StrategoLang-StringQuotedPart2</span>.<span class="cons_Constructor"><span id="QBr_53_34" title="Not referenced">QBr</span></span> = StrategoLang-QuotedBracket2 { }
  <span id="StrategoLang-StringQuotedPart3_54_3" title="Not referenced">StrategoLang-StringQuotedPart3</span>.<span class="cons_Constructor"><span id="QBr_54_34" title="Not referenced">QBr</span></span> = StrategoLang-QuotedBracket3 { }
  <span id="StrategoLang-StringQuotedPart4_55_3" title="Not referenced">StrategoLang-StringQuotedPart4</span>.<span class="cons_Constructor"><span id="QBr_55_34" title="Not referenced">QBr</span></span> = StrategoLang-QuotedBracket4 { }

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-ConstType_26_36" id="StrategoLang-ConstType_59_3" title="Referenced at line 26">StrategoLang-ConstType</a>.<span class="cons_Constructor"><span id="DynT_59_26" title="Not referenced">DynT</span></span> = StrategoLang-Dyn { }
  <span id="StrategoLang-SortT_60_3" title="Not referenced">StrategoLang-SortT</span>.<span class="cons_Constructor"><span id="Sort_60_22" title="Not referenced">Sort</span></span> = [[<a href="../core/identifiers-namespaced.sdf3/#StrategoLang-Id_27_3" id="StrategoLang-Id_60_31" title="Defined at ../core/identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a>]<span class="cons_String">(</span>[{StrategoLang-Type <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>] { }
  <span id="StrategoLang-SortT_61_3" title="Not referenced">StrategoLang-SortT</span>.<span class="cons_Constructor"><span id="SortNoArgs_61_22" title="Not referenced">SortNoArgs</span></span> = <a href="../core/identifiers-namespaced.sdf3/#StrategoLang-UCID_31_3" id="StrategoLang-UCID_61_35" title="Defined at ../core/identifiers-namespaced.sdf3 line 31, 54">StrategoLang-UCID</a> { }
  <span id="StrategoLang-SortT_62_3" title="Not referenced">StrategoLang-SortT</span>.<span class="cons_Constructor"><span id="SortVar_62_22" title="Not referenced">SortVar</span></span> = <a href="../core/identifiers-namespaced.sdf3/#StrategoLang-SortVar_32_3" id="StrategoLang-SortVar_62_32" title="Defined at ../core/identifiers-namespaced.sdf3 line 32, 33">StrategoLang-SortVar</a> { }
  <span id="StrategoLang-SortArg_63_3" title="Not referenced">StrategoLang-SortArg</span>.<span class="cons_Constructor"><span id="TupleT_63_24" title="Not referenced">TupleT</span></span> = [[<a href="../core/signatures-namespaced.sdf3/#StrategoLang-Sort_32_7" id="StrategoLang-Sort_63_35" title="Defined at ../core/signatures-namespaced.sdf3 line 32, 36, 37, 38">StrategoLang-Sort</a>] <span class="cons_String">*</span> [{<a href="../core/signatures-namespaced.sdf3/#StrategoLang-Sort_32_7" id="StrategoLang-Sort_63_58" title="Defined at ../core/signatures-namespaced.sdf3 line 32, 36, 37, 38">StrategoLang-Sort</a> <span class="cons_Lit">" * "</span>}+]] { }
  <span id="StrategoLang-SortArg_64_3" title="Not referenced">StrategoLang-SortArg</span>.<span class="cons_Constructor"><span id="DynT_64_24" title="Not referenced">DynT</span></span> = StrategoLang-Dyn { }
  <span id="StrategoLang-SFunType_65_3" title="Not referenced">StrategoLang-SFunType</span>.<span class="cons_Constructor"><span id="FunType_65_25" title="Not referenced">FunType</span></span> = [<span class="cons_String">(</span>[{StrategoLang-SType <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> [StrategoLang-SSimpleFunType]] { }

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-Coercion_69_3" title="Not referenced">StrategoLang-Coercion</span>.<span class="cons_Constructor"><span id="Fail_69_25" title="Not referenced">Fail</span></span> = [<span class="cons_String">fail</span>] { }
  <span id="StrategoLang-Coercion_70_3" title="Not referenced">StrategoLang-Coercion</span>.<span class="cons_Constructor"><span id="Id_70_25" title="Not referenced">Id</span></span> = [<span class="cons_String">id</span>] { }

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
