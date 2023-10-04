---
title: modules.sdf3
hide:
  - toc
---

# `modules.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/sugar/modules.sdf3]

[pdmosses/stratego/stratego.lang/syntax/sugar/modules.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/sugar/modules.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../main.sdf3#sugar/modules_101_114" id="sugar/modules_7_20" title="Referenced at ../main.sdf3 line 9">sugar/modules</a>
<span class="keyword">imports</span>
  <a href="../../core/modules.sdf3#core/modules_7_19" id="core/modules_31_43" title="Defined at ../../core/modules.sdf3 line 1">core/modules</a>
  <a href="../../core/strategies.sdf3#core/strategies_7_22" id="core/strategies_46_61" title="Defined at ../../core/strategies.sdf3 line 1">core/strategies</a>
  <a href="../overlays.sdf3#sugar/overlays_7_21" id="sugar/overlays_64_78" title="Defined at ../overlays.sdf3 line 1">sugar/overlays</a>
  <a href="../rules.sdf3#sugar/rules_7_18" id="sugar/rules_81_92" title="Defined at ../rules.sdf3 line 1">sugar/rules</a>

<span class="keyword">context-free syntax</span>
  <span id="Decl_116_120" title="Not referenced locally, nor via imports">Decl</span>.<span class="cons_Constructor"><span id="Rules_121_126" title="Not referenced locally, nor via imports">Rules</span></span> =
&lt;<span class="cons_String">rules</span>
  &lt;{<a href="#Def_210_213" id="Def_140_143" title="Defined at line 17">Def</a> <span class="cons_Lit">"\n\n"</span>}*&gt;&gt;

  <span id="Decl_158_162" title="Not referenced locally, nor via imports">Decl</span>.<span class="cons_Constructor"><span id="Overlays_163_171" title="Not referenced locally, nor via imports">Overlays</span></span> =
&lt;<span class="cons_String">overlays</span>
  &lt;{<a href="../overlays.sdf3#Overlay_82_89" id="Overlay_188_195" title="Defined at ../overlays.sdf3 line 6, 8, 10">Overlay</a> <span class="cons_Lit">"\n\n"</span>}*&gt;&gt;

  <a href="#Def_140_143" id="Def_210_213" title="Referenced at line 11">Def</a> = &lt;&lt;<a href="../rules.sdf3#RuleDef_199_206" id="RuleDef_218_225" title="Defined at ../rules.sdf3 line 14, 16, 23, 27, 33">RuleDef</a>&gt;&gt;

</code></pre></td></tr></tbody></table></div>