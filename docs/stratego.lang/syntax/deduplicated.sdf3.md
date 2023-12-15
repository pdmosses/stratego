---
title: deduplicated.sdf3
hide:
  - toc
---

# `deduplicated.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/deduplicated.sdf3]

[pdmosses/stratego/stratego.lang/syntax/deduplicated.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/deduplicated.sdf3 "The source file on GitHub"

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
71
72
73
74
75
76
77
78
79
80
81
82
83
84
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="deduplicated_1_8" title="Not referenced">deduplicated</span>

<span class="keyword">imports</span>
  <a href="../core/terms.sdf3/#core/terms_1_8" id="core/terms_4_3" title="Defined at ../core/terms.sdf3 line 1">core/terms</a>
  <a href="../core/signatures.sdf3/#core/signatures_1_8" id="core/signatures_5_3" title="Defined at ../core/signatures.sdf3 line 1">core/signatures</a>
  <a href="../core/identifiers.sdf3/#core/identifiers_1_8" id="core/identifiers_6_3" title="Defined at ../core/identifiers.sdf3 line 1">core/identifiers</a>

  <a href="../sugar/terms.sdf3/#sugar/terms_1_8" id="sugar/terms_8_3" title="Defined at ../sugar/terms.sdf3 line 1">sugar/terms</a>
  <a href="../sugar/rules.sdf3/#sugar/rules_1_8" id="sugar/rules_9_3" title="Defined at ../sugar/rules.sdf3 line 1">sugar/rules</a>
  <a href="../core/strategies.sdf3/#core/strategies_1_8" id="core/strategies_10_3" title="Defined at ../core/strategies.sdf3 line 1">core/strategies</a>
  <a href="../sugar/dynamic-rules.sdf3/#sugar/dynamic-rules_1_8" id="sugar/dynamic-rules_11_3" title="Defined at ../sugar/dynamic-rules.sdf3 line 1">sugar/dynamic-rules</a>
  <a href="../sugar/string-quotations.sdf3/#sugar/string-quotations_1_8" id="sugar/string-quotations_12_3" title="Defined at ../sugar/string-quotations.sdf3 line 1">sugar/string-quotations</a>

  <a href="../gradual-types/signatures.sdf3/#gradual-types/signatures_1_8" id="gradual-types/signatures_14_3" title="Defined at ../gradual-types/signatures.sdf3 line 1">gradual-types/signatures</a>
  <a href="../gradual-types/strategies.sdf3/#gradual-types/strategies_1_8" id="gradual-types/strategies_15_3" title="Defined at ../gradual-types/strategies.sdf3 line 1">gradual-types/strategies</a>

/*
<span class="keyword">This file contains the original productions of constructors that were renamed to conform to</span>
<span class="keyword">requirements from Statix that every constructor be unique</span>.
*/

<span class="keyword">context-free syntax</span> <span class="layout">// core/terms</span>
  <a href="#PreTerm_23_29" id="PreTerm_23_3" title="Referenced at line 23">PreTerm</a>.<span class="cons_Constructor"><span id="As_23_11" title="Not referenced">As</span></span>      = &lt;&lt;<a href="../core/terms.sdf3/#Var_7_23" id="Var_23_23" title="Defined at ../core/terms.sdf3 line 7, 9">Var</a>&gt;<span class="cons_String">@</span>&lt;<a href="#PreTerm_23_3" id="PreTerm_23_29" title="Defined at line 23, 36, 37">PreTerm</a>&gt;&gt;

<span class="keyword">context-free syntax</span> <span class="layout">// core/signatures</span>
  <span id="SortDef_26_3" title="Not referenced">SortDef</span>.<span class="cons_Constructor"><span id="SortVar_26_11" title="Not referenced">SortVar</span></span>    = <a href="../core/identifiers.sdf3/#LCID_16_22" id="LCID_26_24" title="Defined at ../core/identifiers.sdf3 line 16, 25, 47">LCID</a> {<span class="keyword">deprecated</span>("This syntax never had a clear meaning should not be used")}
  <span id="SortDef_27_3" title="Not referenced">SortDef</span>.<span class="cons_Constructor"><span id="SortNoArgs_27_11" title="Not referenced">SortNoArgs</span></span> = <a href="../core/identifiers.sdf3/#UCID_16_27" id="UCID_27_24" title="Defined at ../core/identifiers.sdf3 line 16, 26, 48">UCID</a>
  <span id="SortDef_28_3" title="Not referenced">SortDef</span>.<span class="cons_Constructor"><span id="Sort_28_11" title="Not referenced">Sort</span></span> = [[<a href="../core/identifiers.sdf3/#UCID_16_27" id="UCID_28_20" title="Defined at ../core/identifiers.sdf3 line 16, 26, 48">UCID</a>]<span class="cons_String">(</span>[{<a href="../core/signatures.sdf3/#Kind_7_20" id="Kind_28_28" title="Defined at ../core/signatures.sdf3 line 7, 9">Kind</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>]
  <span id="SortDef_29_3" title="Not referenced">SortDef</span>.<span class="cons_Constructor"><span id="Sort_29_11" title="Not referenced">Sort</span></span> = &lt;&lt;<a href="../core/identifiers.sdf3/#Id_16_15" id="Id_29_20" title="Defined at ../core/identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../core/signatures.sdf3/#Sort_31_20" id="Sort_29_26" title="Defined at ../core/signatures.sdf3 line 31, 33, 34, 35">Sort</a> <span class="cons_Lit">", "</span>}+&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">deprecated</span>("This syntax never had a clear meaning should be replaced by the version that uses kinds A(*, *)")}

  <span id="SortDef_31_3" title="Not referenced">SortDef</span>.<span class="cons_Constructor"><span id="ExtSort_31_11" title="Not referenced">ExtSort</span></span> = [<span class="cons_String">external</span> [<a href="../core/identifiers.sdf3/#UCID_16_27" id="UCID_31_32" title="Defined at ../core/identifiers.sdf3 line 16, 26, 48">UCID</a>]<span class="cons_String">(</span>[{<a href="../core/signatures.sdf3/#Kind_7_20" id="Kind_31_40" title="Defined at ../core/signatures.sdf3 line 7, 9">Kind</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>]

  <span id="OpType_33_3" title="Not referenced">OpType</span>.<span class="cons_Constructor"><span id="FunType_33_10" title="Not referenced">FunType</span></span> = [[{<a href="#ConstType_71_3" id="ConstType_33_23" title="Defined at line 71">ConstType</a> <span class="cons_Lit">" * "</span>}+] <span class="cons_String">-&gt;</span> [<a href="#ConstType_71_3" id="ConstType_33_46" title="Defined at line 71">ConstType</a>]]

<span class="keyword">context-free syntax</span> <span class="layout">// sugar/terms</span>
  <a href="#PreTerm_23_29" id="PreTerm_36_3" title="Referenced at line 23">PreTerm</a>.<span class="cons_Constructor"><span id="App_36_11" title="Not referenced">App</span></span>       = [<span class="cons_String">&lt;</span>[<a href="#Strategy_45_3" id="Strategy_36_26" title="Defined at line 45, 49">Strategy</a>]<span class="cons_String">&gt;</span> [<a href="../core/terms.sdf3/#Term_13_20" id="Term_36_38" title="Defined at ../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>]]
  <a href="#PreTerm_23_29" id="PreTerm_37_3" title="Referenced at line 23">PreTerm</a>.<span class="cons_Constructor"><span id="RootApp_37_11" title="Not referenced">RootApp</span></span>   = [<span class="cons_String">&lt;</span>[<a href="#Strategy_45_3" id="Strategy_37_26" title="Defined at line 45, 49">Strategy</a>]<span class="cons_String">&gt;</span>]

<span class="keyword">context-free syntax</span> <span class="layout">// sugar/rules</span>
  <span id="Def_40_3" title="Not referenced">Def</span>.<span class="cons_Constructor"><span id="AnnoDef_40_7" title="Not referenced">AnnoDef</span></span> =
    &lt;&lt;<a href="../core/strategies.sdf3/#Anno_42_20" id="Anno_41_7" title="Defined at ../core/strategies.sdf3 line 42, 44, 45, 46">Anno</a>+&gt; &lt;<a href="../sugar/rules.sdf3/#RuleDef_14_20" id="RuleDef_41_15" title="Defined at ../sugar/rules.sdf3 line 14, 16, 23, 27, 33">RuleDef</a>&gt;&gt;

<span class="keyword">syntax</span> <span class="layout">// sugar/dynamic-rules</span>
  <span class="layout">// 1 space after RuleNames</span>
  <a href="#Strategy_36_26" id="Strategy_45_3" title="Referenced at line 36, 37, 46, 51">Strategy</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DynRuleUnionFix_45_15" title="Not referenced">DynRuleUnionFix</span></span> =
  <span class="cons_Lit">"\\"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../sugar/dynamic-rules.sdf3/#RuleNames_62_20" id="RuleNames_46_19" title="Defined at ../sugar/dynamic-rules.sdf3 line 62, 65, 66">RuleNames</a><span class="keyword">-CF</span> <span class="cons_Lit">" /*"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Strategy_45_3" id="Strategy_46_49" title="Defined at line 45, 49">Strategy</a><span class="keyword">-CF</span>

  <span class="layout">// 1 space after RuleNames</span>
  <a href="#Strategy_36_26" id="Strategy_49_3" title="Referenced at line 36, 37, 46, 51">Strategy</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DynRuleIntersectUnionFix_49_15" title="Not referenced">DynRuleIntersectUnionFix</span></span> =
  <span class="cons_Lit">"/"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../sugar/dynamic-rules.sdf3/#RuleNames_62_20" id="RuleNames_50_18" title="Defined at ../sugar/dynamic-rules.sdf3 line 62, 65, 66">RuleNames</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"\\"</span>
      <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../sugar/dynamic-rules.sdf3/#RuleNames_62_20" id="RuleNames_51_18" title="Defined at ../sugar/dynamic-rules.sdf3 line 62, 65, 66">RuleNames</a><span class="keyword">-CF</span> <span class="cons_Lit">" /*"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Strategy_45_3" id="Strategy_51_48" title="Defined at line 45, 49">Strategy</a><span class="keyword">-CF</span>

<span class="keyword">context-free syntax</span> <span class="layout">// sugar/string-quotations</span>

  <span id="StringQuotedPart1_55_3" title="Not referenced">StringQuotedPart1</span>.<span class="cons_Constructor"><span id="QStr_55_21" title="Not referenced">QStr</span></span> = <a href="../sugar/string-quotations.sdf3/#StringQuotedChars1_31_3" id="StringQuotedChars1_55_28" title="Defined at ../sugar/string-quotations.sdf3 line 31, 37">StringQuotedChars1</a>
  <span id="StringQuotedPart2_56_3" title="Not referenced">StringQuotedPart2</span>.<span class="cons_Constructor"><span id="QStr_56_21" title="Not referenced">QStr</span></span> = <a href="../sugar/string-quotations.sdf3/#StringQuotedChars2_32_3" id="StringQuotedChars2_56_28" title="Defined at ../sugar/string-quotations.sdf3 line 32, 38">StringQuotedChars2</a>
  <span id="StringQuotedPart3_57_3" title="Not referenced">StringQuotedPart3</span>.<span class="cons_Constructor"><span id="QStr_57_21" title="Not referenced">QStr</span></span> = <a href="../sugar/string-quotations.sdf3/#StringQuotedChars3_33_3" id="StringQuotedChars3_57_28" title="Defined at ../sugar/string-quotations.sdf3 line 33, 39">StringQuotedChars3</a>
  <span id="StringQuotedPart4_58_3" title="Not referenced">StringQuotedPart4</span>.<span class="cons_Constructor"><span id="QStr_58_21" title="Not referenced">QStr</span></span> = <a href="../sugar/string-quotations.sdf3/#StringQuotedChars4_34_3" id="StringQuotedChars4_58_28" title="Defined at ../sugar/string-quotations.sdf3 line 34, 40">StringQuotedChars4</a>

  <span id="StringQuotedPart1_60_3" title="Not referenced">StringQuotedPart1</span>.<span class="cons_Constructor"><span id="QDollar_60_21" title="Not referenced">QDollar</span></span> = <a href="../sugar/string-quotations.sdf3/#Dollar1_31_22" id="Dollar1_60_31" title="Defined at ../sugar/string-quotations.sdf3 line 31, 42">Dollar1</a>
  <span id="StringQuotedPart2_61_3" title="Not referenced">StringQuotedPart2</span>.<span class="cons_Constructor"><span id="QDollar_61_21" title="Not referenced">QDollar</span></span> = <a href="../sugar/string-quotations.sdf3/#Dollar2_32_22" id="Dollar2_61_31" title="Defined at ../sugar/string-quotations.sdf3 line 32, 43">Dollar2</a>
  <span id="StringQuotedPart3_62_3" title="Not referenced">StringQuotedPart3</span>.<span class="cons_Constructor"><span id="QDollar_62_21" title="Not referenced">QDollar</span></span> = <a href="../sugar/string-quotations.sdf3/#Dollar3_33_22" id="Dollar3_62_31" title="Defined at ../sugar/string-quotations.sdf3 line 33, 44">Dollar3</a>
  <span id="StringQuotedPart4_63_3" title="Not referenced">StringQuotedPart4</span>.<span class="cons_Constructor"><span id="QDollar_63_21" title="Not referenced">QDollar</span></span> = <a href="../sugar/string-quotations.sdf3/#Dollar4_34_22" id="Dollar4_63_31" title="Defined at ../sugar/string-quotations.sdf3 line 34, 45">Dollar4</a>

  <span id="StringQuotedPart1_65_3" title="Not referenced">StringQuotedPart1</span>.<span class="cons_Constructor"><span id="QBr_65_21" title="Not referenced">QBr</span></span> = <a href="../sugar/string-quotations.sdf3/#QuotedBracket1_31_30" id="QuotedBracket1_65_27" title="Defined at ../sugar/string-quotations.sdf3 line 31, 47">QuotedBracket1</a>
  <span id="StringQuotedPart2_66_3" title="Not referenced">StringQuotedPart2</span>.<span class="cons_Constructor"><span id="QBr_66_21" title="Not referenced">QBr</span></span> = <a href="../sugar/string-quotations.sdf3/#QuotedBracket2_32_30" id="QuotedBracket2_66_27" title="Defined at ../sugar/string-quotations.sdf3 line 32, 48">QuotedBracket2</a>
  <span id="StringQuotedPart3_67_3" title="Not referenced">StringQuotedPart3</span>.<span class="cons_Constructor"><span id="QBr_67_21" title="Not referenced">QBr</span></span> = <a href="../sugar/string-quotations.sdf3/#QuotedBracket3_33_30" id="QuotedBracket3_67_27" title="Defined at ../sugar/string-quotations.sdf3 line 33, 49">QuotedBracket3</a>
  <span id="StringQuotedPart4_68_3" title="Not referenced">StringQuotedPart4</span>.<span class="cons_Constructor"><span id="QBr_68_21" title="Not referenced">QBr</span></span> = <a href="../sugar/string-quotations.sdf3/#QuotedBracket4_34_30" id="QuotedBracket4_68_27" title="Defined at ../sugar/string-quotations.sdf3 line 34, 50">QuotedBracket4</a>

<span class="keyword">context-free syntax</span> <span class="layout">// gradual-types/signatures</span>
  <a href="#ConstType_33_23" id="ConstType_71_3" title="Referenced at line 33">ConstType</a>.<span class="cons_Constructor"><span id="DynT_71_13" title="Not referenced">DynT</span></span> = <a href="../gradual-types/signatures.sdf3/#Dyn_7_31" id="Dyn_71_20" title="Defined at ../gradual-types/signatures.sdf3 line 7, 10">Dyn</a>

  <span id="SortT_73_3" title="Not referenced">SortT</span>.<span class="cons_Constructor"><span id="Sort_73_9" title="Not referenced">Sort</span></span>       = [[<a href="../core/identifiers.sdf3/#Id_16_15" id="Id_73_24" title="Defined at ../core/identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>]<span class="cons_String">(</span>[{<a href="../gradual-types/signatures.sdf3/#Type_7_20" id="Type_73_30" title="Defined at ../gradual-types/signatures.sdf3 line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>]
  <span id="SortT_74_3" title="Not referenced">SortT</span>.<span class="cons_Constructor"><span id="SortNoArgs_74_9" title="Not referenced">SortNoArgs</span></span> = <a href="../core/identifiers.sdf3/#UCID_16_27" id="UCID_74_22" title="Defined at ../core/identifiers.sdf3 line 16, 26, 48">UCID</a>
  <span id="SortT_75_3" title="Not referenced">SortT</span>.<span class="cons_Constructor"><span id="SortVar_75_9" title="Not referenced">SortVar</span></span>    = <a href="../core/identifiers.sdf3/#SortVar_16_32" id="SortVar_75_22" title="Defined at ../core/identifiers.sdf3 line 16, 28, 29">SortVar</a>

  <span id="SortArg_77_3" title="Not referenced">SortArg</span>.<span class="cons_Constructor"><span id="TupleT_77_11" title="Not referenced">TupleT</span></span> = [[<a href="../core/signatures.sdf3/#Sort_31_20" id="Sort_77_22" title="Defined at ../core/signatures.sdf3 line 31, 33, 34, 35">Sort</a>] <span class="cons_String">*</span> [{<a href="../core/signatures.sdf3/#Sort_31_20" id="Sort_77_32" title="Defined at ../core/signatures.sdf3 line 31, 33, 34, 35">Sort</a> <span class="cons_Lit">" * "</span>}+]]
  <span id="SortArg_78_3" title="Not referenced">SortArg</span>.<span class="cons_Constructor"><span id="DynT_78_11" title="Not referenced">DynT</span></span>   = <a href="../gradual-types/signatures.sdf3/#Dyn_7_31" id="Dyn_78_20" title="Defined at ../gradual-types/signatures.sdf3 line 7, 10">Dyn</a>

  <span id="SFunType_80_3" title="Not referenced">SFunType</span>.<span class="cons_Constructor"><span id="FunType_80_12" title="Not referenced">FunType</span></span> = [<span class="cons_String">(</span>[{<a href="../gradual-types/signatures.sdf3/#SType_32_20" id="SType_80_26" title="Defined at ../gradual-types/signatures.sdf3 line 32, 34, 35">SType</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> [<a href="../gradual-types/signatures.sdf3/#SSimpleFunType_32_35" id="SSimpleFunType_80_42" title="Defined at ../gradual-types/signatures.sdf3 line 32, 37, 38">SSimpleFunType</a>]]

<span class="keyword">context-free syntax</span> <span class="layout">// gradual-types/strategies</span>
  <span id="Coercion_83_3" title="Not referenced">Coercion</span>.<span class="cons_Constructor"><span id="Fail_83_12" title="Not referenced">Fail</span></span> = [<span class="cons_String">fail</span>]
  <span id="Coercion_84_3" title="Not referenced">Coercion</span>.<span class="cons_Constructor"><span id="Id_84_12" title="Not referenced">Id</span></span> = [<span class="cons_String">id</span>]
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
