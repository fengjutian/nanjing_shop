'use client'
import Image from 'next/image'
import { useState } from 'react';
import { Amap, Marker, config as AmapReactConfig } from '@amap/amap-react';
import { Button, Input, Radio } from "@arco-design/web-react";
import './page.css'
const RadioGroup = Radio.Group;
const InputSearch = Input.Search;

AmapReactConfig.version = '2.0'; // 默认2.0，这里可以不修改
AmapReactConfig.key = 'aeb8ce908e19d3dfc81ca9bc22930b73';
AmapReactConfig.plugins = [
  'AMap.ToolBar',
  'AMap.MoveAnimation',
];

export default function Home() {

  let mapStyle = useState('normal')

  const mapStyleList = [
    {
      title: '标准',
      type: 'normal'
    },
    {
      title: '马卡龙',
      type: 'macaron'
    },
    {
      title: '涂鸦',
      type: 'graffiti'
    },
    {
      title: '远山黛',
      type: 'whitesmoke'
    },
    {
      title: '幻影黑',
      type: 'dark'
    },
    {
      title: '草色青',
      type: 'fresh'
    },
    {
      title: '极夜蓝',
      type: 'darkblue'
    },
    {
      title: '靛青蓝',
      type: 'blue'
    },
    {
      title: '月光银',
      type: 'light'
    },
    {
      title: '雅士灰',
      type: 'grey'
    }
  ]

  // mapList(){

  // }


  return (
    <div style={{ width: '100%', height: '100vh' }}>
      <div className='map-style-wrap'>
        <RadioGroup direction='vertical' defaultValue='a'>
          {
            mapStyleList.map((item, index) => {
              return(
                <Radio value='a'>{item.title}</Radio>
              )
            })
          }
        </RadioGroup>
      </div>

      <InputSearch
        searchButton='Search'
        defaultValue='Search content'
        placeholder='Enter keyword to search'
        style={{ width: 350 }}
      />
      <Amap
        mapStyle={'amap://styles/' + mapStyle}
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
