---
title: rules.sdf3
hide:
  - toc
---

# `rules.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/sugar/rules.sdf3]

[pdmosses/stratego/stratego.lang/syntax/sugar/rules.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/sugar/rules.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../strategies.sdf3#sugar/rules_115_126" id="sugar/rules_7_18" title="Referenced at ../strategies.sdf3 line 8">sugar/rules</a>

  <span class="keyword">imports</span>
    <a href="../../core/identifiers.sdf3#core/identifiers_7_23" id="core/identifiers_34_50" title="Defined at ../../core/identifiers.sdf3 line 1">core/identifiers</a>
    <a href="../../core/signatures.sdf3#core/signatures_7_22" id="core/signatures_55_70" title="Defined at ../../core/signatures.sdf3 line 1">core/signatures</a>
    <a href="../../core/terms.sdf3#core/terms_7_17" id="core/terms_75_85" title="Defined at ../../core/terms.sdf3 line 1">core/terms</a>
    <a href="../../core/strategies.sdf3#core/strategies_7_22" id="core/strategies_90_105" title="Defined at ../../core/strategies.sdf3 line 1">core/strategies</a>
    <a href="../terms.sdf3#sugar/terms_7_18" id="sugar/terms_110_121" title="Defined at ../terms.sdf3 line 1">sugar/terms</a>
    <a href="../strategies.sdf3#sugar/strategies_7_23" id="sugar/strategies_126_142" title="Defined at ../strategies.sdf3 line 1">sugar/strategies</a>

<span class="keyword">template options</span>
  <span class="keyword">tokenize</span>: ")(|"

<span class="keyword">context-free sorts</span> <a href="#RuleDef_315_322" id="RuleDef_199_206" title="Referenced at line 21; ../modules.sdf3 line 17; ../../deduplicated.sdf3 line 41">RuleDef</a> <a href="#RDefT_629_634" id="RDefT_207_212" title="Referenced at line 37">RDefT</a> <a href="#RDefP_543_548" id="RDefP_213_218" title="Referenced at line 33">RDefP</a>
<span class="keyword">context-free syntax</span>
  <a href="#RuleDef_315_322" id="RuleDef_241_248" title="Referenced at line 21; ../modules.sdf3 line 17; ../../deduplicated.sdf3 line 41">RuleDef</a>.<span class="cons_Constructor"><span id="RDefNoArgs_249_259" title="Not referenced locally, nor via imports">RDefNoArgs</span></span> =
&lt;&lt;<a href="../../core/strategies.sdf3#SId_686_689" id="SId_264_267" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>&gt;<span class="cons_String">:</span>
  &lt;<a href="#Rule_664_668" id="Rule_273_277" title="Defined at line 39, 42">Rule</a>&gt;&gt;

  <span id="Def_283_286" title="Not referenced locally, nor via imports">Def</span>.<span class="cons_Constructor"><span id="AnnoRuleDef_287_298" title="Not referenced locally, nor via imports">AnnoRuleDef</span></span> =
    &lt;&lt;<a href="../../core/strategies.sdf3#Anno_825_829" id="Anno_307_311" title="Defined at ../../core/strategies.sdf3 line 42, 44, 45, 46">Anno</a>+&gt; &lt;<a href="#RuleDef_199_206" id="RuleDef_315_322" title="Defined at line 14, 16, 23, 27, 33">RuleDef</a>&gt;&gt;

  <a href="#RuleDef_315_322" id="RuleDef_328_335" title="Referenced at line 21; ../modules.sdf3 line 17; ../../deduplicated.sdf3 line 41">RuleDef</a>.<span class="cons_Constructor"><span id="RDef_336_340" title="Not referenced locally, nor via imports">RDef</span></span> =
&lt;&lt;<a href="../../core/strategies.sdf3#SId_686_689" id="SId_345_348" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../../core/strategies.sdf3#Typedid_953_960" id="Typedid_352_359" title="Defined at ../../core/strategies.sdf3 line 48, 50">Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">):</span>
  &lt;<a href="#Rule_664_668" id="Rule_373_377" title="Defined at line 39, 42">Rule</a>&gt;&gt;

  <a href="#RuleDef_315_322" id="RuleDef_383_390" title="Referenced at line 21; ../modules.sdf3 line 17; ../../deduplicated.sdf3 line 41">RuleDef</a> = <a href="#RDefT_207_212" id="RDefT_393_398" title="Defined at line 14, 28">RDefT</a>
  <a href="#RDefT_629_634" id="RDefT_401_406" title="Referenced at line 37">RDefT</a>.<span class="cons_Constructor"><span id="RDefT_407_412" title="Not referenced locally, nor via imports">RDefT</span></span> =
&lt;&lt;<a href="../../core/strategies.sdf3#SId_686_689" id="SId_417_420" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../../core/strategies.sdf3#Typedid_953_960" id="Typedid_424_431" title="Defined at ../../core/strategies.sdf3 line 48, 50">Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;{<a href="../../core/strategies.sdf3#Typedid_953_960" id="Typedid_444_451" title="Defined at ../../core/strategies.sdf3 line 48, 50">Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">):</span>
  &lt;<a href="#Rule_664_668" id="Rule_465_469" title="Defined at line 39, 42">Rule</a>&gt;&gt;

  <span class="layout">// Rule definition with pattern matched term parameters</span>
  <a href="#RuleDef_315_322" id="RuleDef_533_540" title="Referenced at line 21; ../modules.sdf3 line 17; ../../deduplicated.sdf3 line 41">RuleDef</a> = <a href="#RDefP_213_218" id="RDefP_543_548" title="Defined at line 14, 34, 37">RDefP</a>
  <a href="#RDefP_543_548" id="RDefP_551_556" title="Referenced at line 33">RDefP</a>.<span class="cons_Constructor"><span id="RDefP_557_562" title="Not referenced locally, nor via imports">RDefP</span></span> =
&lt;&lt;<a href="../../core/strategies.sdf3#SId_686_689" id="SId_567_570" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../../core/strategies.sdf3#Typedid_953_960" id="Typedid_574_581" title="Defined at ../../core/strategies.sdf3 line 48, 50">Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;{<a href="../../core/terms.sdf3#Term_180_184" id="Term_594_598" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a> <span class="cons_Lit">", "</span>}+&gt;<span class="cons_String">):</span>
  &lt;<a href="#Rule_664_668" id="Rule_612_616" title="Defined at line 39, 42">Rule</a>&gt;&gt;
  <a href="#RDefP_543_548" id="RDefP_621_626" title="Referenced at line 33">RDefP</a> = <a href="#RDefT_207_212" id="RDefT_629_634" title="Defined at line 14, 28">RDefT</a> {<span class="keyword">reject</span>}

<span class="keyword">context-free sorts</span> <a href="#Rule_612_616" id="Rule_664_668" title="Referenced at line 36; ../dynamic-rules.sdf3 line 45; ../strategies.sdf3 line 78">Rule</a> <a href="#RuleCond_735_743" id="RuleCond_669_677" title="Referenced at line 43">RuleCond</a>
<span class="keyword">context-free syntax</span>

  <a href="#Rule_612_616" id="Rule_701_705" title="Referenced at line 36; ../dynamic-rules.sdf3 line 45; ../strategies.sdf3 line 78">Rule</a>.<span class="cons_Constructor"><span id="Rule_706_710" title="Not referenced locally, nor via imports">Rule</span></span> = [[<a href="../../core/terms.sdf3#Term_180_184" id="Term_715_719" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>] <span class="cons_String">-&gt;</span> [<a href="../../core/terms.sdf3#Term_180_184" id="Term_725_729" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>]
  [{<a href="#RuleCond_669_677" id="RuleCond_735_743" title="Defined at line 39, 45, 48">RuleCond</a> <span class="cons_Lit">"\n"</span>}*]]

  <a href="#RuleCond_735_743" id="RuleCond_756_764" title="Referenced at line 43">RuleCond</a>.<span class="cons_Constructor"><span id="WhereClause_765_776" title="Not referenced locally, nor via imports">WhereClause</span></span> =
&lt;<span class="cons_String">where</span>
  &lt;<a href="../../core/strategies.sdf3#Strategy_1040_1048" id="Strategy_789_797" title="Defined at ../../core/strategies.sdf3 line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>&gt;&gt;
  <a href="#RuleCond_735_743" id="RuleCond_802_810" title="Referenced at line 43">RuleCond</a>.<span class="cons_Constructor"><span id="WithClause_811_821" title="Not referenced locally, nor via imports">WithClause</span></span> =
&lt;<span class="cons_String">with</span>
  &lt;<a href="../../core/strategies.sdf3#Strategy_1040_1048" id="Strategy_833_841" title="Defined at ../../core/strategies.sdf3 line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>&gt;&gt;



</code></pre></td></tr></tbody></table></div>