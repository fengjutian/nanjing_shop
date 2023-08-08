'use client'
import Image from 'next/image'
import { Amap, Marker, config as AmapReactConfig } from '@amap/amap-react';
import { Button, Input } from "@arco-design/web-react";
const InputSearch = Input.Search;

AmapReactConfig.version = '2.0'; // 默认2.0，这里可以不修改
AmapReactConfig.key = 'aeb8ce908e19d3dfc81ca9bc22930b73';
AmapReactConfig.plugins = [
  'AMap.ToolBar',
  'AMap.MoveAnimation',
];

export default function Home() {
  return (
    <div style={{ width: '100%', height: '100vh' }}>
      <InputSearch
        searchButton='Search'
        
        defaultValue='Search content'
        placeholder='Enter keyword to search'
        style={{ width: 350 }}
      />
      <Amap
        mapStyle="amap://styles/normal"
        zoom={15}
        center={[118.784251,32.041918]}
      >
        <Marker
          position={[118.784251,32.041918]}
          label={{
            content: 'Hello, AMap-React!',
            direction: 'bottom',
          }}
        />
      </Amap>
    </div>
  );
}
