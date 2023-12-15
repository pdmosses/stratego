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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../main.sdf3/#sugar/modules_9_3" id="sugar/modules_1_8" title="Referenced at ../main.sdf3 line 9">sugar/modules</a>
<span class="keyword">imports</span>
  <a href="../../core/modules.sdf3/#core/modules_1_8" id="core/modules_3_3" title="Defined at ../../core/modules.sdf3 line 1">core/modules</a>
  <a href="../../core/strategies.sdf3/#core/strategies_1_8" id="core/strategies_4_3" title="Defined at ../../core/strategies.sdf3 line 1">core/strategies</a>
  <a href="../overlays.sdf3/#sugar/overlays_1_8" id="sugar/overlays_5_3" title="Defined at ../overlays.sdf3 line 1">sugar/overlays</a>
  <a href="../rules.sdf3/#sugar/rules_1_8" id="sugar/rules_6_3" title="Defined at ../rules.sdf3 line 1">sugar/rules</a>

<span class="keyword">context-free syntax</span>
  <span id="Decl_9_3" title="Not referenced">Decl</span>.<span class="cons_Constructor"><span id="Rules_9_8" title="Not referenced">Rules</span></span> =
&lt;<span class="cons_String">rules</span>
  &lt;{<a href="#Def_17_3" id="Def_11_5" title="Defined at line 17">Def</a> <span class="cons_Lit">"\n\n"</span>}*&gt;&gt;

  <span id="Decl_13_3" title="Not referenced">Decl</span>.<span class="cons_Constructor"><span id="Overlays_13_8" title="Not referenced">Overlays</span></span> =
&lt;<span class="cons_String">overlays</span>
  &lt;{<a href="../overlays.sdf3/#Overlay_6_20" id="Overlay_15_5" title="Defined at ../overlays.sdf3 line 6, 8, 10">Overlay</a> <span class="cons_Lit">"\n\n"</span>}*&gt;&gt;

  <a href="#Def_11_5" id="Def_17_3" title="Referenced at line 11">Def</a> = &lt;&lt;<a href="../rules.sdf3/#RuleDef_14_20" id="RuleDef_17_11" title="Defined at ../rules.sdf3 line 14, 16, 23, 27, 33">RuleDef</a>&gt;&gt;

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
