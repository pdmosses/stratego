---
title: signatures.sdf3
hide:
  - toc
---

# `signatures.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/sugar/signatures.sdf3]

[pdmosses/stratego/stratego.lang/syntax/sugar/signatures.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/sugar/signatures.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="sugar/signatures_1_8" title="Multi-file references" data-urls="../main.sdf3/#sugar/signatures_8_3 line 8; ../strategies.sdf3/#sugar/signatures_10_3 line 10">sugar/signatures</button>

<span class="keyword">imports</span>
  <a href="../../core/signatures.sdf3/#core/signatures_1_8" id="core/signatures_4_3" title="Defined at ../../core/signatures.sdf3 line 1">core/signatures</a>
  <a href="../constants.sdf3/#sugar/constants_1_8" id="sugar/constants_5_3" title="Defined at ../constants.sdf3 line 1">sugar/constants</a>
  <a href="../../core/identifiers.sdf3/#core/identifiers_1_8" id="core/identifiers_6_3" title="Defined at ../../core/identifiers.sdf3 line 1">core/identifiers</a>

<span class="keyword">context-free syntax</span>
  <a href="#Sort_9_25" id="Sort_9_3" title="Referenced at line 9, 10, 11">Sort</a>.<span class="cons_Constructor"><span id="SortList_9_8" title="Not referenced">SortList</span></span>   = &lt;<span class="cons_String">[</span>&lt;{<a href="#Sort_9_3" id="Sort_9_25" title="Defined at line 9, 10, 11">Sort</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">]</span>&gt; {<span class="keyword">deprecated</span>("This syntax never had real meaning and will be dropped")}
  <a href="#Sort_9_25" id="Sort_10_3" title="Referenced at line 9, 10, 11">Sort</a>.<span class="cons_Constructor"><span id="SortListTl_10_8" title="Not referenced">SortListTl</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#Sort_9_3" id="Sort_10_25" title="Defined at line 9, 10, 11">Sort</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;<a href="#Sort_9_3" id="Sort_10_41" title="Defined at line 9, 10, 11">Sort</a>&gt; <span class="cons_String">]</span>&gt; {<span class="keyword">deprecated</span>("This syntax never had real meaning and will be dropped")}
  <a href="#Sort_9_25" id="Sort_11_3" title="Referenced at line 9, 10, 11">Sort</a>.<span class="cons_Constructor"><span id="SortTuple_11_8" title="Not referenced">SortTuple</span></span>  = &lt;<span class="cons_String">(</span>&lt;{<a href="#Sort_9_3" id="Sort_11_25" title="Defined at line 9, 10, 11">Sort</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">)</span>&gt; {<span class="keyword">deprecated</span>("This syntax is being replaced")}

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
